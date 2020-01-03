package com.lti.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
	private final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
	private final String user = "hr";
	private final String pass = "hr";
	Connection connection = null;

	public Connection getConnection() throws SQLException, ClassNotFoundException {

		if (connection == null) {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection(URL, user, pass);
		}
		System.out.println("Database Connected");
		return connection;
		
	}
}
