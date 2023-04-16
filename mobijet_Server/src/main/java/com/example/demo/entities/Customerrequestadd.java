package com.example.demo.entities;

import java.util.Date;

import javax.persistence.Column;

public class Customerrequestadd {

	 int userid;
	   String company;
	   String model;
	   String pstatement;
	   String type;
	   Date date;
	public Customerrequestadd() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Customerrequestadd(int userid, String company, String model, String pstatement, String type, Date date) {
		super();
		this.userid = userid;
		this.company = company;
		this.model = model;
		this.pstatement = pstatement;
		this.type = type;
		this.date = date;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getPstatement() {
		return pstatement;
	}
	public void setPstatement(String pstatement) {
		this.pstatement = pstatement;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}
