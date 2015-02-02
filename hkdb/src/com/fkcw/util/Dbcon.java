package com.fkcw.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Dbcon {
	private String dburl="jdbc:mysql://10.0.30.241:3306/db_hki";
	private String dbuname = "root";
	private String dbupass ="password";
	private String jdbcname = "com.mysql.jdbc.Driver";
	public Connection getcon() throws Exception{
		
			Class.forName(jdbcname);
			Connection con = DriverManager.getConnection(dburl,dbuname,dbupass);
	 
		return con;
	}
	public void closecon(Connection con){
		if (con!=null) {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		Dbcon dbcon = new Dbcon();
		try {
			dbcon.getcon();
			System.out.println("Connected");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
