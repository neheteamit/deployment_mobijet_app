package com.example.demo.entities;

public class LoginCheck {
	String emailid;
	String userpassword;
	public LoginCheck() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoginCheck(String emailid, String userpassword) {
		super();
		this.emailid = emailid;
		this.userpassword = userpassword;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getUserpassword() {
		return userpassword;
	}
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	
	

}
