package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.City;
import com.example.demo.service.CityService;
import com.example.demo.service.LoginService;

@CrossOrigin(origins="http://localhost:3000",allowedHeaders = "*")

@RestController
public class CityController {
	@Autowired
	 CityService cservice;
	 @GetMapping("/allcities")
	 public List<City> getcities()
	 {
		 return cservice.getall();
	 }

}
