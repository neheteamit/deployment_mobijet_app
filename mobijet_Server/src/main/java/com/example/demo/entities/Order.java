package com.example.demo.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="orders")
public class Order {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int oid;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="userid")
	User userid;
	@Column
	String paymentmode;
	@Column
	String status;
	@Column
	Date orderdate;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="pid")
	Product pid;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(User userid, String paymentmode, String status, Date orderdate, Product pid) {
		super();
		this.userid = userid;
		this.paymentmode = paymentmode;
		this.status = status;
		this.orderdate = orderdate;
		this.pid = pid;
	}
	
	public User getUserid() {
		return userid;
	}
	public void setUserid(User userid) {
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
	public Product getPid() {
		return pid;
	}
	public void setPid(Product pid) {
		this.pid = pid;
	}
}
