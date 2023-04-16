package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entities.CustomerRequest;
import com.example.demo.entities.Solution;
import com.example.demo.repository.SolutionRepository;

@Service
public class SolutionService {
	@Autowired
     SolutionRepository srepo;
     public Solution getByreqid(CustomerRequest c)	
     {
    	 return srepo.getByreqid(c);
     }
     public Solution savesolution(@RequestBody Solution s)
     {
    	 return srepo.save(s);
     }
}