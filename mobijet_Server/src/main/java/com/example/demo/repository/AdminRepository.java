package com.example.demo.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Admin;

@Transactional
@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {
	@Query(value="select * from admin where emailid=?1 and password=?2", nativeQuery=true)
	public Admin checklogin(String emailid,String password);

}
