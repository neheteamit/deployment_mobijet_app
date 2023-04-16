package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.entities.Area;
import com.example.demo.entities.City;
import com.example.demo.entities.Login;
import com.example.demo.entities.User;
import com.example.demo.service.AreaService;
import com.example.demo.service.CityService;
import com.example.demo.service.LoginService;
import com.example.demo.entities.UserRegister;
import com.example.demo.service.UserService;

@CrossOrigin(origins="http://localhost:3000",allowedHeaders = "*")
@RestController
public class UserController {

	
	@Autowired
	UserService uservice;
	@Autowired
	LoginService lservice;
	@Autowired
	AreaService aservice;
	@Autowired
	CityService cservice;
	/*@GetMapping("/getbyuid")
	public User getLogin(@RequestParam("uid") int uid)
	{
	
		return uservice.getbyuid(uid);
	}
	*/
	@PostMapping("/register")
	public User registerUser(@RequestBody UserRegister u)
	{
		System.out.println(u);
		Login l=new Login(u.getUseremail(),u.getUserpassword(),u.getRole(),u.isStatus());
		System.out.println(l);
	    Login inserted1=lservice.saveLogin(l); 
	    /*Area a=new Area(u.getAreaname(),inserted2,u.getPincode());
	    Area inserted3=aservice.add(a); */ 		
	    Area a = aservice.getByid(u.getAreaid());
	    System.out.println(a);
	    User us=new User(inserted1,u.getFname(),u.getLname(),u.getEmailid(),u.getContactno(),u.getAddress(),a);
	   System.out.println(us);
	    return uservice.add(us);
	    //System.out.println(u);
	}
	@GetMapping("/getUser")
	public User getUser(@RequestParam("uid") int id)
	{
		Login l = lservice.getByid(id);
		System.out.println(l);
		User u = uservice.getUser(l);
		System.out.println(u);
		return u;
	}
	@GetMapping("/getallUser")
	 public List<User> getallusers()
	 {
		 return uservice.getall();
	 }
	
	
	
}
