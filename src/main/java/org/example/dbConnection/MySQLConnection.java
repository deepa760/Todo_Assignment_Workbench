package org.example.dbConnection;


import org.example.exception.MySQLConnectionException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {
    private static String URL ="" ;
    private static String USERNAME = "root";
    private static String PASSWORD = "root";

    public static Connection mySQLGetConnection() throws MySQLConnectionException {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new MySQLConnectionException(e.getMessage());
        }
        return connection;
    }
}