package com.example.demo.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Order;
import com.example.demo.entities.OrderAdd;
import com.example.demo.entities.Product;
import com.example.demo.entities.RateAdd;
import com.example.demo.entities.Rating;
import com.example.demo.entities.User;
import com.example.demo.service.ProductService;
import com.example.demo.service.RatingService;
import com.example.demo.service.UserService;

@CrossOrigin(origins="http://localhost:3000",allowedHeaders = "*")
@RestController
public class RatingController {
	@Autowired
	RatingService rservice;
	@Autowired
	ProductService prservice;
	@Autowired
	UserService usservice;
	@PostMapping("/rateus")
	public Rating placeOrder(@RequestBody RateAdd r)
	{
		User u=usservice.getByid(r.getRatinguserid());
		Product p=prservice.getByid(r.getPid());
		Rating rt=new Rating(p,u,r.getRating(),r.getComment());
		return rservice.SaveRating(rt);
	
	}
}
