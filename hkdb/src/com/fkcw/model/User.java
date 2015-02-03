package com.fkcw.model;

public class User {
	private int id;
	private String userName;
	private String userPass;
	
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String userName, String userPass) {
		super();
		this.userName = userName;
		this.userPass = userPass;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	

}
