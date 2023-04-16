package com.example.demo.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="area")
public class Area {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    int areaid;
	
    @Column
	String areaname;

    @OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="cityid")
    City cityid;
    
    @Column
    String pincode;
    
	public Area() {
		super();
		// TODO Auto-generated constructor stub
	}



	

	public Area(String areaname, City cityid, String pincode) {
		super();
		this.areaname = areaname;
		this.cityid = cityid;
		this.pincode = pincode;
	}





	public int getAreaid() {
		return areaid;
	}





	public void setAreaid(int areaid) {
		this.areaid = areaid;
	}





	




	public City getCityid() {
		return cityid;
	}





	public void setCityid(City cityid) {
		this.cityid = cityid;
	}





	public String getPincode() {
		return pincode;
	}





	public void setPincode(String pincode) {
		this.pincode = pincode;
	}





	public String getAreaname() {
		return areaname;
	}

	public void setAreaname(String areaname) {
		this.areaname = areaname;
	}




}
