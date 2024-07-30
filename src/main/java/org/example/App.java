package org.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;


public class App {
    private static final String DB_URL; //= "jdbc:mariadb://localhost:3310/compta";
    private static final String DB_USER; // = "root";
    private static final String DB_PWD; // = "toto";

    static {
        ResourceBundle bundle = ResourceBundle.getBundle("db");
        DB_URL = bundle.getString("db.url");
        DB_USER = bundle.getString("db.user");
        DB_PWD = bundle.getString("db.pwd");
    }
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection(DB_URL,DB_USER, DB_PWD);
        System.out.println("Connection : " + connection);
        connection.close();
    }
}
