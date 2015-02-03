package com.fkcw.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class ItemDetail {
	private int itemadd(Connection con,ItemDetail itde) throws SQLException{
		String sql = "insert into tbl_item values(null,?,?,?,?,?,?,?,? )";
		PreparedStatement pstmt =con.prepareStatement(sql);
		return null;
	}
}
