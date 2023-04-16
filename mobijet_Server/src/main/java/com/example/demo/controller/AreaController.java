package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Area;
import com.example.demo.entities.City;
import com.example.demo.service.AreaService;
import com.example.demo.service.CityService;

@CrossOrigin(origins="http://localhost:3000",allowedHeaders = "*")

@RestController
public class AreaController {

	@Autowired
	 AreaService aservice;
	@Autowired
	 CityService cservice;
	 
	
	 @GetMapping("/getareabyid")	 
	 public List<Area> getcities(@RequestParam("cityid") int cityid)
	 {
		City c = cservice.getByid(cityid); 
		return aservice.getByAreaId(c);
	 }

}


