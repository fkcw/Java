package com.fkcw.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




public class OrdDao {
	
	public ResultSet getRs(Connection co) throws SQLException{
		String sql = "SELECT * FROM tbl_item";
		PreparedStatement pstmt= co.prepareStatement(sql);
		return pstmt.executeQuery();
	}
}
