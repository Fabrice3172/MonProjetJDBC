package org.example;
import java.sql.*;
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

        //Connection cnx = null;
        //Statement st = null;
        try (Connection cnx = DriverManager.getConnection(DB_URL,DB_USER,DB_PWD); Statement st = cnx.createStatement();){
            ///connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PWD);
            System.out.println("Connection : " + cnx);
            //connection.createStatement();

            //Creation du CRUD: créer nouveau fournisseur
            int nbCrees = st.executeUpdate("INSERT INTO FOURNISSEUR(NOM) VALUES('La maison de la peinture')");
            // ResultSet curseur = statement.executeQuery("SELECT * FROM CLIENT");
        }
        catch (SQLException exception){
            //exception.printStackTrace();
            System.err.println(exception.getMessage());
        }
        finally{
            //st.close();
            //cnx.close(); JAVA fermera cette ressource
            //connection.close();
        }
        //cnx.close();
    }
}
