package com.fkcw.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TblDao {
	private ResultSet rs=null;
	/*
	 * return tbl_rs result
	 */
	public ResultSet rttblrsrs(Connection conn) throws SQLException{
		String sql = "SELECT Date,StoreName,OrderNum ,Approved,Comment FROM tbl_rs ORDER BY Date";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		rs= pstmt.executeQuery();
		return rs;
	}
	/*
	 * return tbl_ns result
	 */
	public ResultSet rttblnsrs(Connection conn) throws SQLException{
		String sql = "SELECT Date,StoreName,OrderNum,Approved,Comment FROM tbl_ns ORDER BY Date";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		rs= pstmt.executeQuery();
		return rs;
	}
	
}
