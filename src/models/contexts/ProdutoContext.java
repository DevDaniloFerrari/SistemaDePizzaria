package models.contexts;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import models.ProdutoModel;

public class ProdutoContext extends Context {

    public static void adicionar(ProdutoModel model) {
        abrirConexao();

        String query = "INSERT INTO Produto ("
                + "                        Nome,"
                + "                        Preco"
                + "                    )"
                + "                    VALUES ("
                + "                        '{Nome}',"
                + "                        '{Preco}'"
                + "                    );";

        query = query.replace("{Nome}", model.getNome())
                .replace("{Preco}", Float.toString(model.getPreco()));

        executarQuery(query);

        fecharConexao();
    }

    public static void deletar(ProdutoModel model) {
        abrirConexao();

        String query = "DELETE FROM Produto"
                + "      WHERE Id = '{Id}';";

        query = query.replace("{Id}", Integer.toString(model.getId()));

        executarQuery(query);

        fecharConexao();
    }

    public static void atualizar(ProdutoModel model) {
        abrirConexao();

        String query = "UPDATE Produto"
                + "   SET Nome = '{Nome}',"
                + "       Preco = '{Preco}'"
                + " WHERE Id = '{Id}'";

        query = query.replace("{Nome}", model.getNome())
                .replace("{Preco}", Float.toString(model.getPreco()))
                .replace("{Id}", Integer.toString(model.getId()));

        executarQuery(query);

        fecharConexao();
    }

    public static ArrayList<ProdutoModel> obter(String nome) throws SQLException {
        abrirConexao();

        ArrayList<ProdutoModel> models = null;

        String query = "SELECT Id,"
                + "       Nome,"
                + "       Preco"
                + "  FROM Produto"
                + "  WHERE"
                + "      Nome LIKE '%{Nome}%';";

        query = query.replace("{Nome}", nome);

        ResultSet resultSet = executarQuery(query);

        while (resultSet.next()) {
            models.add(new ProdutoModel(
                    resultSet.getInt("Id"),
                    resultSet.getString("Nome"),
                    resultSet.getFloat("Preco")));
        }

        fecharConexao();

        return models;
    }

    public static ProdutoModel obter(int id) throws SQLException {
        abrirConexao();

        ProdutoModel model = null;

        String query = "SELECT Id,"
                + "       Nome,"
                + "       Preco"
                + "  FROM Produto"
                + "  WHERE"
                + "      Id = '{Id}';";

        query = query.replace("{Id}", Integer.toString(id));

        ResultSet resultSet = executarQuery(query);

        while (resultSet.next()) {
            model = new ProdutoModel(
                    resultSet.getInt("Id"),
                    resultSet.getString("Nome"),
                    resultSet.getFloat("Preco"));
        }

        fecharConexao();

        return model;
    }

    public static ArrayList<ProdutoModel> obter() throws SQLException {
        abrirConexao();

        ArrayList<ProdutoModel> models = null;

        String query = "SELECT Id,"
                + "       Nome,"
                + "       Preco"
                + "  FROM Produto;";

        ResultSet resultSet = executarQuery(query);

        while (resultSet.next()) {
            models.add(new ProdutoModel(
                    resultSet.getInt("Id"),
                    resultSet.getString("Nome"),
                    resultSet.getFloat("Preco")));
        }
        fecharConexao();

        return models;
    }
}
