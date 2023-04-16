package com.example.demo.entities;

public class UserRegister {

	String useremail;
	String userpassword;
	String role;
	boolean status;	
	String fname;
	String lname;
	String emailid;
	String contactno;
	String address;
		
	
	int areaid;

	public UserRegister() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	/*public UserRegister(String useremail, String userpassword, String role, boolean status, String fname, String lname,
			String emailid, String contactno, String address, String areaname, int pincode,int cityid, String cityname) {
		super();
		this.useremail = useremail;
		this.userpassword = userpassword;
		this.role = role;
		this.status = status;
		this.fname = fname;
		this.lname = lname;
		this.emailid = emailid;
		this.contactno = contactno;
		this.address = address;
		this.areaname = areaname;
		this.pincode = pincode;
		this.cityid=cityid;
		this.cityname = cityname;
	}*/
	
	


	public String getUseremail() {
		return useremail;
	}


	@Override
	public String toString() {
		return "UserRegister [useremail=" + useremail + ", userpassword=" + userpassword + ", role=" + role
				+ ", status=" + status + ", fname=" + fname + ", lname=" + lname + ", emailid=" + emailid
				+ ", contactno=" + contactno + ", address=" + address + ", areaid=" + areaid + "]";
	}


	public UserRegister(String useremail, String userpassword, String role, boolean status, String fname, String lname,
			String emailid, String contactno, String address,  int areaid) {
		super();
		this.useremail = useremail;
		this.userpassword = userpassword;
		this.role = role;
		this.status = status;
		this.fname = fname;
		this.lname = lname;
		this.emailid = emailid;
		this.contactno = contactno;
		this.address = address;
	
		this.areaid = areaid;
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


	



	public int getAreaid() {
		return areaid;
	}


	public void setAreaid(int areaid) {
		this.areaid = areaid;
	}


	


	
}
