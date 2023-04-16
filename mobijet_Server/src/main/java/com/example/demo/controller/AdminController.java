package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Admin;
import com.example.demo.entities.Admincheck;
import com.example.demo.entities.Login;
import com.example.demo.entities.LoginCheck;
import com.example.demo.service.AdminService;
import com.example.demo.service.LoginService;

@CrossOrigin(origins="http://localhost:3000",allowedHeaders = "*")
@RestController
public class AdminController {

	@Autowired
	AdminService aservice;
	
	
	@PostMapping("/adminlogin")
	public Admin logincheck(@RequestBody Admincheck chk)
	{
		Admin a = aservice.checklogin(chk.getEmailid(),chk.getPassword());
	 System.out.println(a);
		return a;
	}
	
}
