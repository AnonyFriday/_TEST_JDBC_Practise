/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit
 * this template
 */
package database;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author duyvu
 */
public final class DBUtils {

	// =================================
	// == SQL Server
	// =================================
	/**
	 * Make the Connection to the SQL Server
	 *
	 * @return
	 */
	public static Connection connectSQLServer() {
		Connection conn = null;
		try {
			final String dbURL    = """
					jdbc:sqlserver://localhost:1433;\
					databaseName=Bookstore;\
					encrypt=true;\
					trustServerCertificate=true;""";
			final String username = "sa";
			final String password = "334/26/30a";

			conn = DriverManager.getConnection(dbURL, username, password);
		} catch (final SQLException ex) {
			ex.printStackTrace();
		}
		return conn;
	}

	/**
	 * Method to close the connection on SQL Server
	 *
	 * @param conn
	 */
	public static void closeConnectionSQLServer(final Connection conn) {
		try {
			if (conn == null || conn.isClosed())
				return;
			conn.close();
		} catch (final SQLException ex) {
			ex.printStackTrace();
		}
	}

	// =================================
	// == MySQL
	// =================================
	// =================================
	// == General Methods
	// =================================
	public static void printDBServerInfo(final Connection conn) {
		try {
			final DatabaseMetaData dm = conn.getMetaData();
			System.out.println("Driver name: " + dm.getDriverName());
			System.out.println("Driver version: " + dm.getDriverVersion());
		} catch (final SQLException ex) {
			ex.printStackTrace();
		}
	}
}
