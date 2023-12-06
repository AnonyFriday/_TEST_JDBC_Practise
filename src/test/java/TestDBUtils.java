
import database.DBUtils;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author duyvu
 */
public class TestDBUtils {

    public static void main(String[] args) {

        try {
            /**
             * Follow 5 step to interact with JDBC with SQL Server
             */

            // Step 1: Connect to the sql server
            Connection conn = DBUtils.connectSQLServer();
            DBUtils.printDBServerInfo(conn);

            // Step 2: Create Statement, ResultSet(optional)
            Statement st = conn.createStatement();

            // Step 3: Create the sql query string and execute
            String sql = """
                        insert into Book
                        values (1234567891234, 'Don''t be stupid like that', 'Paulo Coelho', 2, 2099);
                        """;

            int check = st.executeUpdate(sql);

            // Step 4: Handle the returned value
            System.out.println("Records changed: " + check);

            // Step 5: Close the connection
            DBUtils.closeConnectionSQLServer(conn);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
