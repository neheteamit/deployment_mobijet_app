package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.CustomerRequest;
import com.example.demo.entities.Solution;
import com.example.demo.entities.SolutionAdd;
import com.example.demo.entities.User;
import com.example.demo.service.CustomerRequestService;
import com.example.demo.service.SolutionService;
import com.example.demo.service.UserService;

@CrossOrigin(origins="http://localhost:3000",allowedHeaders = "*")
@RestController
public class SolutionController {
	@Autowired
	SolutionService sservice;
	@Autowired
	CustomerRequestService crservice;
	@Autowired
	UserService usservice;
	@GetMapping("/getsolutionbyreqid")
	public Solution getsolutionByreqid(@RequestParam("reqid") int reqid)
	{
		CustomerRequest cr = crservice.getByid(reqid);
		System.out.println(cr);
		Solution s = sservice.getByreqid(cr);
		System.out.println(s);
		return s;
	}
	@PostMapping("/savesolution")
	public Solution saveandupload(@RequestBody SolutionAdd s)
	{
		CustomerRequest cr = crservice.getByid(s.getReqid());
		User u=usservice.getByid(s.getUserid());
		Solution sl=new Solution(cr,u,s.getRemark(),s.getStatus());
		System.out.println(sl);
		return sservice.savesolution(sl);
	}

}
