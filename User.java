package com.infs740.model;

public class User {

	private String username;
	private String password;
	
	public User(String name, String pass) {
		username=name;
		password=pass;
	}
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	

	public void setUsername(String name) {
		username=name;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setPassword(String pass) {
		password=pass;
	}
	
	public String getPassword() {
		return password;
	}
}
