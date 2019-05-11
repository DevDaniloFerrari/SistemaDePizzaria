package models.contexts;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import models.ClienteModel;
import models.EnderecoModel;

public class ClienteContext extends Context {

    public void adicionar(ClienteModel model) {
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

    public void deletar(ClienteModel model) {
        abrirConexao();

        String query = "DELETE FROM Cliente"
                + "      WHERE Telefone = '{Telefone}';";

        query = query.replace("{Telefone}", model.getTelefone());

        executarQuery(query);

        fecharConexao();
    }

    public void atualizar(ClienteModel model) {
        abrirConexao();

        String query = "UPDATE Cliente"
                + "   SET Nome = '{Nome}',"
                + "       Logradouro = '{Logradouro}',"
                + "       Numero = '{Numero}',"
                + "       Complemento = '{Complemento}'"
                + " WHERE Telefone = '{Telefone}';";

        query = query.replace("{Telefone}", model.getTelefone())
                .replace("{Nome}", model.getNome())
                .replace("{Logradouro}", model.getEndereco().getLogradouro())
                .replace("{Numero}", model.getEndereco().getNumero())
                .replace("{Complemento}", model.getEndereco().getComplemento())
                .replace("{Telefone}", model.getTelefone());

        executarQuery(query);

        fecharConexao();
    }

    public ClienteModel obter(String telefone) throws SQLException {
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
                    resultSet.getString("Nome"),
                    new EnderecoModel(resultSet.getString("Logradouro"),
                            resultSet.getString("Numero"),
                            resultSet.getString("Complemento")));
        }

        fecharConexao();

        return model;
    }

    public ArrayList<ClienteModel> obter() throws SQLException {
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
                    resultSet.getString("Nome"),
                    new EnderecoModel(resultSet.getString("Logradouro"),
                            resultSet.getString("Numero"),
                            resultSet.getString("Complemento"))));
        }

        fecharConexao();

        return models;
    }
}
