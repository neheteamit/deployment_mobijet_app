package com.example.demo.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Login;

@Transactional
@Repository
public interface LoginRepository extends JpaRepository<Login, Integer> {

	@Query(value="select * from login where useremail=?1 and userpassword=?2", nativeQuery=true)
	public Login checklogin(String emailid,String userpassword);
	@Modifying
	@Query("update Login set status = :status where uid= :uid")
	public int updatestatus(boolean status,int uid);
	/*@Modifying
	@Query("delete  from Login where uid= :uid")
	public int deleteuser(int uid);*/
}