package com.example.demo.controller;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Order;
import com.example.demo.entities.OrderAdd;
import com.example.demo.entities.Product;
import com.example.demo.entities.User;
import com.example.demo.service.OrderService;
import com.example.demo.service.ProductService;
import com.example.demo.service.UserService;

@CrossOrigin(origins="http://localhost:3000",allowedHeaders = "*")
@RestController
public class OrderController {
	@Autowired
	OrderService oservice;
	@Autowired
	ProductService prservice;
	@Autowired
	UserService usservice;
	
	@PostMapping("/placeorder")
	public Order placeOrder(@RequestBody OrderAdd o)
	{
		User u=usservice.getByid(o.getUserid());
		Product p=prservice.getByid(o.getPid());
		Date current=new Date();
       //LocalDate deliverydate=  LocalDate.now().plusDays(7);
		//System.out.println(deliverydate);
		Order or=new Order(u,o.getPaymentmode(),o.getStatus(),o.getOrderdate(),p);
		return oservice.saveorder(or);
	
	}
	@GetMapping("Getallorders")
	public List<Order>getall()
	{
		return oservice.getall();
	}
}
