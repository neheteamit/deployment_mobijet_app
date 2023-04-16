package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entities.Area;
import com.example.demo.entities.CustomerRequest;
import com.example.demo.entities.User;
import com.example.demo.repository.CustomerrequestRepository;


@Service
public class CustomerRequestService {

	@Autowired
	CustomerrequestRepository crrepo;
    public CustomerRequest getByid(int reqid)
    {
    	return crrepo.findById(reqid).get();    	
    }
    public Optional<CustomerRequest> getByuserid(int userid)
    {
    	return crrepo.findById(userid);
    }
    
    public CustomerRequest getrequestuserid(User u)
    {
    	return crrepo.getByUser(u);
    }
    public List<CustomerRequest>getall()
    {
    	return crrepo.findAll();
    }
    public CustomerRequest SaveRequest(@RequestBody CustomerRequest c )
    {
    	return crrepo.save(c);
    	
    	
    }
    
    public List<CustomerRequest> getbyArea(Area a)
    {
    	return crrepo.getreq(a);
    }
    
}
