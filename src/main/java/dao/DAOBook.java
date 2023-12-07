/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import database.DBUtils;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Book;

/**
 * This class will handle the interaction between Model and DatabaseF
 *
 * @author duyvu
 */
public class DAOBook implements DAOInterface<Book> {

    // =================================
    // == Fields
    // =================================
    private static DAOBook daoBookInstance;

    // =================================
    // == Constructor
    // =================================
    /**
     * Constructor using singleton
     *
     * @return
     */
    private DAOBook() {
    }

    public static DAOBook getInstance() {
        if (daoBookInstance == null) {
            daoBookInstance = new DAOBook();
        }
        return daoBookInstance;
    }

    // =====================================
    // == Override Methods from DAOInterface
    // =====================================
    /**
     * Insert a new book to the database using prepared statement
     * 5 Steps
     * - Connect to database
     * - Create the statement instance
     * - Create the sql query
     * - Create the
     *
     * @param t: a new book
     *
     * @return the row count affected
     */
    @Override
    public int insert(Book t) {
        int isInserted = 0;
        try {
            Connection conn = DBUtils.connectSQLServer();
            Statement st = conn.createStatement();
            String sql = "insert into Book\n"
                    + "values ("
                    + "'" + t.getIsbn() + "',"
                    + "'" + t.getTitle() + "',"
                    + "'" + t.getAuthor() + "',"
                    + t.getEdition() + ","
                    + t.getPublishedyear() + ");";

            System.out.println(sql);

            isInserted = st.executeUpdate(sql);
            DBUtils.closeConnectionSQLServer(conn);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return isInserted;
    }

    @Override
    public int delete(Book t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int update(Book t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * Select every records from the table
     *
     * @return
     */
    @Override
    public ArrayList<Book> selectAll() {
        ArrayList<Book> results = new ArrayList<>();
        try {

            // Step 1
            Connection conn = DBUtils.connectSQLServer();

            // Step 2
            String sql = """
                         select *
                         from Book as b
                         """;

            // Step 3
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            // Step 4
            while (rs.next()) {
                String isbn = rs.getString("Isbn");
                String author = rs.getString("Author");
                String title = rs.getString("Title");
                int edition = rs.getInt("Edition");
                int publishedYear = rs.getInt("PublishedYear");

                // Adding to the results
                results.add(new Book(isbn, title, author, edition, publishedYear));
            }
            
            // Step 5
            DBUtils.closeConnectionSQLServer(conn);

        } catch (SQLException ex) {
            Logger.getLogger(DAOBook.class.getName()).log(Level.SEVERE, null, ex);
        }

        return results;
    }

    @Override
    public Book selectById() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Book selectByCondition(String condition) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
