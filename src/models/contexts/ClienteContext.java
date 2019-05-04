package models.contexts;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import models.ClienteModel;
import models.EnderecoModel;

public class ClienteContext extends Context {

    public static void adicionar(ClienteModel model) {
        abrirConexao();

        String query = "INSERT INTO Cliente ("
                + "                        Telefone,"
                + "                        Nome,"
                + "                        Logradouro,"
                + "                        Numero,"
                + "                        Complemento"
                + "                    )"
                + "                    VALUES ("
                + "                        '{Telefone}',"
                + "                        '{Nome}',"
                + "                        '{Logradouro}',"
                + "                        '{Numero}',"
                + "                        '{Complemento}'"
                + "                    );";

        query = query.replace("{Telefone}", model.getTelefone())
                .replace("{Nome}", model.getNome())
                .replace("{Logradouro}", model.getEndereco().getLogradouro())
                .replace("{Numero}", model.getEndereco().getNumero())
                .replace("{Complemento}", model.getEndereco().getComplemento());

        executarQuery(query);

        fecharConexao();
    }

    public static void deletar(ClienteModel model) {
        abrirConexao();

        String query = "DELETE FROM Cliente"
                + "      WHERE Telefone = '{Telefone}';";

        query = query.replace("{Telefone}", model.getTelefone());

        executarQuery(query);

        fecharConexao();
    }

    public static void atualizar(String telefoneReferencia, ClienteModel model) {
        abrirConexao();

        String query = "UPDATE Cliente"
                + "   SET Telefone = '{Telefone}',"
                + "       Nome = '{Nome}',"
                + "       Logradouro = '{Logradouro}',"
                + "       Numero = '{Numero}',"
                + "       Complemento = '{Complemento}'"
                + " WHERE Telefone = '{TelefoneReferencia}';";

        query = query.replace("{Telefone}", model.getTelefone())
                .replace("{Nome}", model.getNome())
                .replace("{Logradouro}", model.getEndereco().getLogradouro())
                .replace("{Numero}", model.getEndereco().getNumero())
                .replace("{Complemento}", model.getEndereco().getComplemento())
                .replace("{TelefoneReferencia}", telefoneReferencia);

        executarQuery(query);

        fecharConexao();
    }

    public static ClienteModel obter(String telefone) throws SQLException {
        abrirConexao();

        ClienteModel model = null;

        String query = "SELECT Telefone,"
                + "       Nome,"
                + "       Logradouro,"
                + "       Numero,"
                + "       Complemento"
                + "  FROM Cliente"
                + "  WHERE"
                + "      Telefone = '{Telefone}';"
                + "";

        query = query.replace("{Telefone}", telefone);

        ResultSet resultSet = executarQuery(query);

        while (resultSet.next()) {
            model = new ClienteModel(resultSet.getString("Telefone"),
                    resultSet.getString("Logradouro"),
                    new EnderecoModel(resultSet.getString("Logradouro"),
                            resultSet.getString("Numero"),
                            resultSet.getString("Complemento")));
        }

        fecharConexao();

        return model;
    }

    public static ArrayList<ClienteModel> obter() throws SQLException {
        abrirConexao();

        ArrayList<ClienteModel> models = null;

        String query = "SELECT Telefone,"
                + "       Nome,"
                + "       Logradouro,"
                + "       Numero,"
                + "       Complemento"
                + "  FROM Cliente;";

        ResultSet resultSet = executarQuery(query);

        while (resultSet.next()) {
            models.add(new ClienteModel(resultSet.getString("Telefone"),
                    resultSet.getString("Logradouro"),
                    new EnderecoModel(resultSet.getString("Logradouro"),
                            resultSet.getString("Numero"),
                            resultSet.getString("Complemento"))));
        }

        fecharConexao();

        return models;
    }
}
