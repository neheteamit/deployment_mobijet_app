package com.example.demo.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.City;
import com.example.demo.entities.Login;
import com.example.demo.entities.LoginCheck;
import com.example.demo.service.LoginService;
@CrossOrigin(origins="http://localhost:3000",allowedHeaders = "*")

@RestController
public class LoginController {
	
	@Autowired
	LoginService uservice;
	
	
	@PostMapping("/logincheck")
	public Login logincheck(@RequestBody LoginCheck chk)
	{
		Login l = uservice.checklogin(chk.getEmailid(),chk.getUserpassword());
	 System.out.println(l);
		return l;
	}
	@PostMapping("/save")
	public Login saveLogin(@RequestBody Login l)
	{
		return	uservice.saveLogin(l);
	}
	 @GetMapping("/getbyuid")
	 public Login getlogin(@RequestParam("uid")int uid)
	 {
		 return uservice.getByid(uid);
	 }
	 @PostMapping("/changestatus")
		public boolean updatestatus(@RequestParam("status") boolean status,@RequestParam("uid") int uid)
		{
			System.out.println("hi");
			boolean flag=false;
			try{
			flag=uservice.updatestatus(status, uid);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return flag;
		}
      @PostMapping("/deleteuser")
      public void deleteuser(@RequestParam("uid") int uid)
      {
    	  uservice.deleteuser(uid);
      }
}