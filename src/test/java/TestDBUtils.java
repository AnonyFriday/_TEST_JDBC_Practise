
import database.DBUtils;
import java.sql.Connection;

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
        Connection conn = DBUtils.connectSQLServer();
        DBUtils.printDBServerInfo(conn);
        DBUtils.closeConnectionSQLServer(conn);
    }
}
