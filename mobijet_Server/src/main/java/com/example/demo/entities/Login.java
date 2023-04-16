package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="login")
public class Login {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int uid;
	@Column
	String useremail;
	@Column
	String userpassword;
	@Column
	String role;
	@Column
	boolean status;
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Login( String useremail, String userpassword, String role, boolean status) {
		super();
	
		this.useremail = useremail;
		this.userpassword = userpassword;
		this.role = role;
		this.status = status;
	}
	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUseremail() {
		return useremail;
	}

	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}

	public String getUserpassword() {
		return userpassword;
	}

	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Login [uid=" + uid + ", useremail=" + useremail + ", userpassword=" + userpassword + ", role=" + role
				+ ", status=" + status + "]";
	}
	
	
	
}
