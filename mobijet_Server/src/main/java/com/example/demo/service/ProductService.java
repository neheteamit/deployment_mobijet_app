package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.entities.Area;
import com.example.demo.entities.City;
import com.example.demo.entities.Login;
import com.example.demo.entities.Product;
import com.example.demo.entities.User;
import com.example.demo.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository prrepo;
	public Product getByid(int pid)
	{
		return prrepo.findById(pid).get();
	}
	public List<Product>getProductPid(User u)
	{
		return prrepo.getByuser(u);
	}
	public List<Product> getall()
	{
		return prrepo.findAll();
	}	
	public Product saveProduct(@RequestBody Product p)
	{  
		return prrepo.save(p);  //image = null
		
	}
	public boolean upload(int pid,byte[] bs)
	{
		if(prrepo.upload(pid, bs)==1)
			return true;
		else return false;
	}
	
	public void deleteproduct(int pid)
	{
		prrepo.deleteById(pid);
	}
	public boolean deletepr(int pid)
	{
		if(prrepo.deletepr(pid)==1)
			return true;
		else return false;
	}
}
