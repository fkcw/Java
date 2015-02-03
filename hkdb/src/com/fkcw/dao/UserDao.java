package com.fkcw.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.fkcw.model.User;


public class UserDao {
	/**
	 * Login Authentication
	 * @param con
	 * @param user
	 * @return
	 * @throws SQLException
	 */
	public User login(Connection con,User user) throws SQLException{
		User rsUser =null;
		String sql= "select * from tbl_user where userName=? and userPass = ?";

		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1,user.getUserName());
		pstmt.setString(2,user.getUserPass());
		ResultSet rs = pstmt.executeQuery();
		if (rs.next()) {
			rsUser = new User();
			rsUser.setUserName(rs.getString("userName"));
			rsUser.setUserPass(rs.getString("userPass"));
		}
		return rsUser;
	}
}
