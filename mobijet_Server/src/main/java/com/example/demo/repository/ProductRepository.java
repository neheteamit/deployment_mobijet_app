package com.example.demo.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.entities.Area;
import com.example.demo.entities.City;
import com.example.demo.entities.Product;
import com.example.demo.entities.User;
@Transactional
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

	@Query("select p from Product p where userid = :userid")
	public List<Product> getByuser(User userid);
	
	@Modifying
	@Query("update Product set image = :bs where pid= :pid")
	public int upload(int pid,byte[] bs);
	@Modifying
	@Query("delete from Product where pid= :pid")
	public int deletepr(int pid);
}
