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
@Table(name="rating")
public class Rating {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int rid;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="pid")
	Product pid;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="ratinguserid")
	User ratinguserid;
	@Column
	int rating;
	@Column
	String comment;
	
	public Rating() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rating( Product pid, User ratinguserid, int rating, String comment) {
		super();
		this.pid = pid;
		this.ratinguserid = ratinguserid;
		this.rating = rating;
		this.comment = comment;
	}

	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public Product getPid() {
		return pid;
	}

	public void setPid(Product pid) {
		this.pid = pid;
	}

	public User getRatinguserid() {
		return ratinguserid;
	}

	public void setRatinguserid(User ratinguserid) {
		this.ratinguserid = ratinguserid;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	

}
