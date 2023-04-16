package com.example.demo.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="customerrequest")

public class CustomerRequest {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
   int reqid;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="userid")
   User userid;
	@Column
   String company;
	@Column
   String model;
	@Column
   String pstatement;
	@Column
   String type;
	@Column
   Date date;
	public CustomerRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomerRequest(User userid, String company, String model, String pstatement, String type, Date date) {
		super();
		this.userid = userid;
		this.company = company;
		this.model = model;
		this.pstatement = pstatement;
		this.type = type;
		this.date = date;
	}
	public int getReqid() {
		return reqid;
	}
	public void setReqid(int reqid) {
		this.reqid = reqid;
	}
	public User getUserid() {
		return userid;
	}
	public void setUserid(User userid) {
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
   
}
