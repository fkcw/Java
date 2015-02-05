package com.fkcw.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.fkcw.model.User;

public class UserDao {

	public boolean login(Connection co,User user) throws SQLException{
		String sql= "SELECT * FROM tbl_user WHERE userName= ? and userPass = ?";
		PreparedStatement pstmt = co.prepareStatement(sql);
		pstmt.setString(1, user.getUserName());
		pstmt.setString(2, user.getUserPass());
		ResultSet rs = pstmt.executeQuery();
		if (rs.next()) {
			return true;
		}else{
			return false;
		}
	}
}
