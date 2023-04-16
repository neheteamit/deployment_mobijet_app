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
@Table(name="solution")
public class Solution {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int sid;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="reqid")
	 CustomerRequest reqid;
	 @OneToOne(cascade = CascadeType.ALL)
 	 @JoinColumn(name="userid")
     User userid;
	 @Column
	 String remark;
	 @Column
	 String status;
	public Solution() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Solution(CustomerRequest reqid, User userid, String remark, String status) {
		super();
		this.reqid = reqid;
		this.userid = userid;
		this.remark = remark;
		this.status = status;
	}
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public CustomerRequest getReqid() {
		return reqid;
	}
	public void setReqid(CustomerRequest reqid) {
		this.reqid = reqid;
	}
	public User getUserid() {
		return userid;
	}
	public void setUserid(User userid) {
		this.userid = userid;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}


	 
	 
	 
}
