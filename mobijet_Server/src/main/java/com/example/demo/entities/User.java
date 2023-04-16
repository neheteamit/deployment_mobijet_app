package com.example.demo.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="user")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int userid;


	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="uid")
	Login uid;
	@Column
	String fname;
	@Column
	String lname;
	@Column
	String emailid;
	@Column
	String contactno;
	@Column
	String address;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="areaid")
	Area areaid;
	
	
	public User() {
		super();
	}
	public User( Login uid,String fname, String lname, String emailid, String contactno, String address, Area areaid) {
		super();
		this.uid=uid;
		this.fname = fname;
		this.lname = lname;
		this.emailid = emailid;
		this.contactno = contactno;
		this.address = address;
		this.areaid = areaid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public Login getUid() {
		return uid;
	}
	public void setUid(Login uid) {
		this.uid = uid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Area getAreaid() {
		return areaid;
	}
	public void setAreaid(Area areaid) {
		this.areaid = areaid;
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", uid=" + uid + ", fname=" + fname + ", lname=" + lname + ", emailid="
				+ emailid + ", contactno=" + contactno + ", address=" + address + ", areaid=" + areaid + "]";
	}
	
	
	
}
