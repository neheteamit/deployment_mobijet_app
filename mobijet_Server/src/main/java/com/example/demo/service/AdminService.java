package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Admin;
import com.example.demo.repository.AdminRepository;

@Service
public class AdminService {
	@Autowired
	AdminRepository arepo;
	public Admin checklogin(String emailid,String password)
	{
		Admin a=arepo.checklogin(emailid, password);
		if(a!=null)
		{
			System.out.println("true");
			return a;
		}
		
		else
		{
			System.out.println("false");
		return null;
		}
	}
}
