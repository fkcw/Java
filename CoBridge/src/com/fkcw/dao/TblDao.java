package com.fkcw.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TblDao {
	private static ResultSet rs=null;
	private static PreparedStatement pstmt;
	/*
	 * return tbl_rs result
	 */
	public ResultSet rttblrsrs(Connection conn) throws SQLException{
		
		String sqlrs = "SELECT Date,StoreName,OrderNum ,Approved,Comment FROM tbl_rs ORDER BY Date";
		pstmt = conn.prepareStatement(sqlrs);
		rs= pstmt.executeQuery();
		
		return rs;
	}
	/*
	 * return tbl_ns result
	 */
	public ResultSet rttblnsrs(Connection conn) throws SQLException{
		String sqlns = "SELECT Date,StoreName,OrderNum,Approved,Comment FROM tbl_ns ORDER BY Date";
		pstmt = conn.prepareStatement(sqlns);
		rs= pstmt.executeQuery();
		
		return rs;
	}
	
}
