package models.contexts;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import models.ProdutoModel;

public class ProdutoContext extends Context {

    public void adicionar(ProdutoModel model) {
        abrirConexao();

        String query = "INSERT INTO Produto ("
                + "                        Nome,"
                + "                        Preco"
                + "                    )"
                + "                    VALUES ("
                + "                        '{Nome}',"
                + "                        '{Preco}'"
                + "                    );";

        query = query.replace("{Nome}", model.getDescricao())
                .replace("{Preco}", Float.toString(model.getPreco()));

        executarQuery(query);

        fecharConexao();
    }

    public void deletar(ProdutoModel model) {
        abrirConexao();

        String query = "DELETE FROM Produto"
                + "      WHERE IdProduto = '{IdProduto}';";

        query = query.replace("{IdProduto}", Integer.toString(model.getIdProduto()));

        executarQuery(query);

        fecharConexao();
    }

    public void atualizar(ProdutoModel model) {
        abrirConexao();

        String query = "UPDATE Produto"
                + "   SET Descricao = '{Descricao}',"
                + "       Preco = '{Preco}'"
                + " WHERE IdProduto = '{IdProduto}'";

        query = query.replace("{Descricao}", model.getDescricao())
                .replace("{Preco}", Float.toString(model.getPreco()))
                .replace("{IdProduto}", Integer.toString(model.getIdProduto()));

        executarQuery(query);

        fecharConexao();
    }

    public ArrayList<ProdutoModel> obter(String nome) throws SQLException {
        abrirConexao();

        ArrayList<ProdutoModel> models = new ArrayList();

        String query = "SELECT IdProduto,"
                + "       Descricao,"
                + "       Preco"
                + "  FROM Produto"
                + "  WHERE"
                + "      Nome LIKE '%{Nome}%';";

        query = query.replace("{Nome}", nome);

        ResultSet resultSet = executarQuery(query);

        while (resultSet.next()) {
            models.add(new ProdutoModel(
                    resultSet.getInt("IdProduto"),
                    resultSet.getString("Descricao"),
                    resultSet.getFloat("Preco")));
        }

        fecharConexao();

        return models;
    }

    public ProdutoModel obter(int IdProduto) throws SQLException {
        abrirConexao();

        ProdutoModel model = null;

        String query = "SELECT IdProduto,"
                + "       Descricao,"
                + "       Preco"
                + "  FROM Produto"
                + "  WHERE"
                + "      Id = '{IdProduto}';";

        query = query.replace("{IdProduto}", Integer.toString(IdProduto));

        ResultSet resultSet = executarQuery(query);

        while (resultSet.next()) {
            model = new ProdutoModel(
                    resultSet.getInt("IdProduto"),
                    resultSet.getString("Descricao"),
                    resultSet.getFloat("Preco"));
        }

        fecharConexao();

        return model;
    }

    public ArrayList<ProdutoModel> obter() throws SQLException {
        abrirConexao();

        ArrayList<ProdutoModel> models = new ArrayList();

        String query = "SELECT IdProduto,"
                + "       Descricao,"
                + "       Preco"
                + "  FROM Produto;";

        ResultSet resultSet = executarQuery(query);

        while (resultSet.next()) {
            models.add(new ProdutoModel(
                    resultSet.getInt("IdProduto"),
                    resultSet.getString("Descricao"),
                    resultSet.getFloat("Preco")));
        }
        fecharConexao();

        return models;
    }
    
}
