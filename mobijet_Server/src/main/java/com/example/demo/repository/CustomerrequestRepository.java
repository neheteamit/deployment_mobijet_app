package com.example.demo.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Area;
import com.example.demo.entities.CustomerRequest;
import com.example.demo.entities.User;
@Transactional
@Repository
public interface CustomerrequestRepository extends JpaRepository<CustomerRequest, Integer> {
  
	@Query("select c from CustomerRequest c where userid=: userid")
	public CustomerRequest getByUser(User userid);
	
	@Query("select cr from CustomerRequest cr where userid.areaid = :a")	
	public List<CustomerRequest> getreq(Area a);
}
