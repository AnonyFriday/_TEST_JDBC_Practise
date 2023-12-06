/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author duyvu
 */
public final class DBUtils {

    
    /**
     * Make the Connection to the SQL Server
     * @return 
     */
    public static Connection connectSQLServer() {
        Connection conn = null;
        try {
            String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=Bookstore;encrypt=true;trustServerCertificate=true";
            String username = "sa";
            String password = "334/26/30a";

            conn = DriverManager.getConnection(dbURL, username, password);
        } catch (SQLException ex) {
            System.err.println("Error: Connection failed");
        }
        return conn;
    }
}
