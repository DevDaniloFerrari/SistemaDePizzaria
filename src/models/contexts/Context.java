package models.contexts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class Context {

    private static Connection _connection = null;

    protected static void abrirConexao() {

        try {

            String url = "jdbc:sqlite:D:\\Projetos\\Java\\SistemaDePizzaria\\db\\pizzaria.db";

            _connection = DriverManager.getConnection(url);
        } catch (SQLException ex) {
            //logar
        }
    }

    protected static void fecharConexao() {
        try {
            if (_connection != null) {
                _connection.close();
            }
        } catch (SQLException ex) {
            //logar
        }
    }

    protected static ResultSet executarQuery(String query) {
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            statement = _connection.createStatement();
            resultSet = statement.executeQuery(query);
        } catch (SQLException ex) {
            //logar
        }
        return resultSet;
    }
}
