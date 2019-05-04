package models.contexts;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import models.ClienteModel;
import models.EnderecoModel;
import models.PedidoModel;
import models.ProdutoModel;

public class PedidoContext extends Context {

    public void adicionar(String telefone, int idProduto) {
        abrirConexao();

        String query = "INSERT INTO Pedido ("
                + "                       Cliente,"
                + "                       Produto"
                + "                   )"
                + "                   VALUES ("
                + "                       '{Cliente}',"
                + "                       '{Produto}'"
                + "                   );";

        query = query.replace("{Cliente}", telefone)
                .replace("{Produto}", Integer.toString(idProduto));

        executarQuery(query);

        fecharConexao();
    }

    public PedidoModel obter(String telefone) throws SQLException {
        abrirConexao();
        
        PedidoModel pedidoModel=null;
        ClienteModel clienteModel = null;
        ArrayList<ProdutoModel> produtosModel = new ArrayList();

        String query = "SELECT * FROM Cliente"
                + "    INNER JOIN Pedido"
                + "        ON Cliente.Telefone = Pedido.Cliente"
                + "    INNER JOIN Produto"
                + "        ON Pedido.Produto = Produto.IdProduto"
                + " WHERE Telefone = '{Telefone}';";

        query = query.replace("{Telefone}", telefone);
        
        ResultSet resultSet = executarQuery(query);

        while (resultSet.next()) {
            if (clienteModel == null) {
                clienteModel = new ClienteModel(resultSet.getString("Telefone"),
                        resultSet.getString("Nome"),
                        new EnderecoModel(resultSet.getString("Logradouro"),
                                resultSet.getString("Numero"),
                                resultSet.getString("Complemento")));
            }

            produtosModel.add(new ProdutoModel(
                    resultSet.getInt("IdProduto"),
                    resultSet.getString("Descricao"),
                    resultSet.getFloat("Preco")));

        }

        pedidoModel = new PedidoModel(clienteModel, produtosModel);
        
        fecharConexao();

        return pedidoModel;

    }

}
