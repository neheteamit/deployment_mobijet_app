package com.example.demo.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int pid;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="userid")
	User userid;
	@Column
	String price;
	@Column
	String company;
	@Column
	String model;
	@Column
	String description;
	@Column(nullable = true)
	byte[] image;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

	public Product(User userid,String price, String company, String model, String description) {
		super();
		this.userid = userid;
		this.price = price;
		this.company = company;
		this.model = model;
		this.description = description;
	 
	}




	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public User getUserid() {
		return userid;
	}
	public void setUserid(User userid) {
		this.userid = userid;
	}
	
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}




	public byte[] getImage() {
		return image;
	}




	public void setImage(byte[] image) {
		this.image = image;
	}
 

}
