/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import database.DBUtils;
import java.sql.Connection;
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

    @Override
    public ArrayList<Book> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
