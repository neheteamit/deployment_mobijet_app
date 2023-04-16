package com.example.demo.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entities.City;
import com.example.demo.entities.Login;
import com.example.demo.repository.LoginRepository;

@Service
public class LoginService {

	@Autowired
	LoginRepository urepo;
	public Login checklogin(String emailid,String userpassword)
	{
		Login l=urepo.checklogin(emailid, userpassword);
		if(l!=null)
		{
			System.out.println("true");
			return l;
		}
		
		else
		{
			System.out.println("false");
		return null;
		}
	}
	public Login saveLogin(@RequestBody Login l)
	{  
		return urepo.save(l);
		
	}

	public Login getByid(int uid)
	{
		return urepo.findById(uid).get();
	}
	public List<Login>getall()
	{
		return urepo.findAll();
	}
	public boolean updatestatus(boolean status,int uid)
	{
		if(urepo.updatestatus(status, uid)==1)
			return true;
		else return false;
	}
	public void deleteuser(int uid)
	{
		urepo.deleteById(uid);
	}
}
