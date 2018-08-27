package br.edu.unifacisa.si.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class ConnectionDAO {
	private static ConnectionDAO connectionDao;

	private ConnectionDAO() {
	}

	private static Connection con = null;

	public static Connection Connect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			if (con == null) {
				con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/map", "root", "");
			}
		} catch (SQLException | ClassNotFoundException cnf) {
			cnf.getMessage();
		}
		return con;
	}

	public static synchronized ConnectionDAO getInstace() {
		if (connectionDao == null) {
			connectionDao = new ConnectionDAO();
		}
		return connectionDao;
	}

}
