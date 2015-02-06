package com.fkcw.DBUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	private static String URL="jdbc:mysql://10.0.30.241:3306/db_hki";
	private static String DBuser = "root";
	private static String DBpass = "password";
	private static String jdbcname = "com.mysql.jdbc.Driver";
	
	public Connection getCon() throws SQLException, ClassNotFoundException{
		Class.forName(jdbcname);
		Connection con = DriverManager.getConnection(URL,DBuser,DBpass);
		return con;
		
	}
	public void closeCon(Connection con) throws SQLException{
		if(con!=null){
			con.close();
		}
	}
	public void main(){
		DBUtil DBinstance = new DBUtil();
		try {
			DBinstance.getCon();
			System.out.println("Connected");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
