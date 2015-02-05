package com.fkcw.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.fkcw.model.Item;



public class ItemDao {
	public int itemadd(Connection con,Item item) throws SQLException{
		String sql = "insert into tbl_item values(null,?,?,?,?,?,?,?,? )";
		PreparedStatement pstmt =con.prepareStatement(sql);
		pstmt.setString(1, item.getProcode());
		pstmt.setString(2, item.getArea());
		pstmt.setString(3, item.getFacode());
		pstmt.setString(4, item.getClasss());
		pstmt.setString(5, item.getDes());
		pstmt.setString(6, item.getDes_cn());
		pstmt.setString(7, item.getVendor());
		pstmt.setDouble(8, item.getPrice());
		return pstmt.executeUpdate();
	}
	public ResultSet itemsearch(Connection co) throws SQLException{
		String sql = "SELECT * FROM tbl_item";
		PreparedStatement pstmt = co.prepareStatement(sql);
		return pstmt.executeQuery();
	}
}
