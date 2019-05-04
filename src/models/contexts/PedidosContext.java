package models.contexts;

import models.ClienteModel;
import models.ProdutoModel;

public class PedidosContext extends Context {

    public static void adicionar(ClienteModel clienteModel, ProdutoModel pedidoModel) {
        abrirConexao();

        String query = "INSERT INTO Pedido ("
                + "                       Cliente,"
                + "                       Produto"
                + "                   )"
                + "                   VALUES ("
                + "                       '{Cliente}',"
                + "                       '{Produto}'"
                + "                   );";

        query = query.replace("{Cliente}", clienteModel.getTelefone())
                .replace("{Produto}", Integer.toString(pedidoModel.getId()));

        executarQuery(query);

        fecharConexao();
    }

}
