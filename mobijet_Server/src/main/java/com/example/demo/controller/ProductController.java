package com.example.demo.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.entities.Area;
import com.example.demo.entities.Product;
import com.example.demo.entities.ProductAdd;
import com.example.demo.entities.User;
import com.example.demo.service.ProductService;
import com.example.demo.service.UserService;

@CrossOrigin(origins="http://localhost:3000",allowedHeaders = "*")
@RestController
public class ProductController {


	@Autowired
	ProductService prservice;
	@Autowired
	UserService usservice;
	@GetMapping("getallproducts")
	public List<Product>getAll()
	{
		return prservice.getall();
		}
	
	@GetMapping("getproductsbyid")
	public Product getproduct(@RequestParam("pid") int pid)
	{
		return prservice.getByid(pid);
	}
	@PostMapping(value="/saveproduct")
	public Product productinfo(@RequestBody ProductAdd p)
	{
		User u=usservice.getByid(p.getUserid());
		Product pr=new Product(u,p.getPrice(),p.getDescription(),p.getModel(),p.getCompany());
		return prservice.saveProduct(pr);
	}
	
	@PostMapping(value="/uploadimage/{pid}",consumes="multipart/form-data")
	public boolean updateimage(@PathVariable("pid") int pid,@RequestBody MultipartFile file)
	{
		System.out.println("hi");
		boolean flag=false;
		try{
		flag=prservice.upload(pid,file.getBytes());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return flag;
	}
	@PostMapping("/deleteproduct")
	public boolean deleteproduct(@RequestParam("pid") int pid)
	{
		boolean flag=false;
		if(prservice.deletepr(pid)==true);
		{
			flag= true;
		}
		return flag;
	}
	
	@PostMapping("/saveProduct")
	public Product Saveandupload(@RequestPart("data")Product p,MultipartFile file)
	{
		
		Product savecon=prservice.saveProduct(p);
		boolean flag=true;
		try {
		byte []data=file.getBytes();
		Path path=Paths.get("images//"+savecon.getPid()+".jpg");
		Files.write(path, data);
		}
		catch(Exception e)
		{
			flag=false;
		}
		if(flag)
			return savecon;
		else
			return null;
	}
	
}

