package com.fkcw.db;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	private static final String DBUrl="jdbc:mysql://127.0.0.1:3306/hki_demo";
	private static final String DBUsername="root";
	private static final String DBPassword="password";

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			DriverManager.getConnection(DBUrl, DBUsername, DBPassword);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
