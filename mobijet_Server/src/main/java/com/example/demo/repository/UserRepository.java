package com.example.demo.repository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Area;
import com.example.demo.entities.Login;
import com.example.demo.entities.User;
@Transactional
@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

	@Query("select u from User u where uid= :l")
	public User getUser(Login l);
	@Query("select u from User u where areaid= :a")
	public User getByareaid(Area a);

	/*@Modifying
	@Query("update User set uid.status = :status where userid= :userid")
	public int updatestatus(boolean status,int userid);*/
}
