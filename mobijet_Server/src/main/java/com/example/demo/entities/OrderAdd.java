package com.example.demo.entities;

import java.util.Date;


public class OrderAdd {
	int userid;
	String paymentmode;
	String status;
	Date orderdate;
	int pid;
	public OrderAdd() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderAdd(int userid, String paymentmode, String status, Date orderdate, int pid) {
		super();
		this.userid = userid;
		this.paymentmode = paymentmode;
		this.status = status;
		this.orderdate = orderdate;
		this.pid = pid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getPaymentmode() {
		return paymentmode;
	}
	public void setPaymentmode(String paymentmode) {
		this.paymentmode = paymentmode;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
}
