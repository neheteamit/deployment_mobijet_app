package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.entities.City;
import com.example.demo.repository.CityRepository;


@Service
public class CityService {
	@Autowired
	CityRepository crepo;
	
	public City getByid(int id)
	{
		return crepo.findById(id).get();
	}
	public List<City>getall()
	{
		return crepo.findAll();
	}	

}
