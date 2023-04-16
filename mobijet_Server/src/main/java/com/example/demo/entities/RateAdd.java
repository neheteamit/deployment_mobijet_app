package com.example.demo.entities;


public class RateAdd {
	int pid;
	int ratinguserid;
	int rating;
	String comment;

	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getRatinguserid() {
		return ratinguserid;
	}
	public void setRatinguserid(int ratinguserid) {
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
