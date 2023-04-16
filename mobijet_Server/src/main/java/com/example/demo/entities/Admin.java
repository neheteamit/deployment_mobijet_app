package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin")
public class Admin {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int adminid;
	@Column
	String emailid;
	@Column
	String password;
	@Column
	String contactno;
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Admin(String emailid, String password, String contactno) {
		super();
		this.emailid = emailid;
		this.password = password;
		this.contactno = contactno;
	}
	public int getAdminid() {
		return adminid;
	}
	public void setAdminid(int adminid) {
		this.adminid = adminid;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
}
