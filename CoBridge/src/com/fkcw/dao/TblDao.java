package com.fkcw.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TblDao {
	private ResultSet rs=null;
	public ResultSet rtnordrs(Connection conn) throws SQLException{
		String sql = "SELECT * FROM tbl_item";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		rs= pstmt.executeQuery();
		return rs;
	}
	
}
