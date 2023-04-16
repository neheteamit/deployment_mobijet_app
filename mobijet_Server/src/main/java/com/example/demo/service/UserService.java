package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Area;
import com.example.demo.entities.Login;
import com.example.demo.entities.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository usrepo;
	public  User add(User u)
	{
	return usrepo.save(u);
	}
	public User getByid(int userid)
	{
		return usrepo.findById(userid).get();
	}
	
	public User getbyuid(int uid)
	{
		return usrepo.findById(uid).get();
	}
	public User getUser(Login l)
	{
		
		return usrepo.getUser(l);
	}
	public User getByareaid(Area a)
	{
		return usrepo.getByareaid(a);
	}
	public List<User>getall()
	{
		return usrepo.findAll();
	}
	/*public boolean updatestatus(boolean status,int userid)
	{
		if(usrepo.updatestatus(status, userid)==1)
			return true;
		else return false;
	}*/
}


