package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entities.Rating;
import com.example.demo.repository.RatingRepository;

@Service
public class RatingService {
	@Autowired
    RatingRepository raterepo;
	
	public Rating SaveRating(@RequestBody Rating r)
	{
	  return raterepo.save(r);
	}
	

}
