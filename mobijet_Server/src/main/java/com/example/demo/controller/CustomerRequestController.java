package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Area;
import com.example.demo.entities.CustomerRequest;
import com.example.demo.entities.Customerrequestadd;
import com.example.demo.entities.Login;
import com.example.demo.entities.Product;
import com.example.demo.entities.User;
import com.example.demo.service.AreaService;
import com.example.demo.service.CustomerRequestService;
import com.example.demo.service.ProductService;
import com.example.demo.service.UserService;

@CrossOrigin(origins="http://localhost:3000",allowedHeaders = "*")
@RestController
public class CustomerRequestController {

	@Autowired
	CustomerRequestService crservice;
	@Autowired
	 AreaService aservice;
	@Autowired
	UserService usservice;
	@PostMapping("/saverequest")
	
	public CustomerRequest SaveRequest(@RequestBody Customerrequestadd c)
	{
		User u=usservice.getByid(c.getUserid());
		CustomerRequest cr=new CustomerRequest(u,c.getCompany(),c.getModel(),c.getPstatement(),c.getType(),c.getDate());
	    return crservice.SaveRequest(cr);	
	}
	
	@GetMapping("getrequestbyreqid")
	public CustomerRequest getproduct(@RequestParam("reqid") int reqid)
	{
		return crservice.getByid(reqid);
	}
	
	@GetMapping("getrequestbyuserid")
	public CustomerRequest getreqByuserid(@RequestBody User u)
	{
		//User u=usservice.getByid(userid);
		return crservice.getrequestuserid(u);
	}
	
	@GetMapping("getallrequest")
	public List<CustomerRequest>getAll()
	{
		return crservice.getall();
	}
	
	@GetMapping("getrequestbyareaid")
	public List<CustomerRequest> getbyareaid(@RequestParam("areaid") int areaid)
	{

		Area a = aservice.getByid(areaid);
		System.out.println(a);
		//User u = usservice.getByareaid(a);
		//System.out.println(u);
		return crservice.getbyArea(a);
	}

}
