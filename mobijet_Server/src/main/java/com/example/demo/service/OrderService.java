package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entities.Order;
import com.example.demo.entities.Product;
import com.example.demo.repository.OrderRepository;

@Service
public class OrderService {
	@Autowired
	OrderRepository orepo;
	public Order saveorder(@RequestBody Order o)
	{
		return orepo.save(o);
	}
	public List<Order>getall()
	{
		return orepo.findAll();
	}

}
