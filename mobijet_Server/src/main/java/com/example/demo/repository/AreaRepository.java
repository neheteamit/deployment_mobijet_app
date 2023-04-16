package com.example.demo.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Area;
import com.example.demo.entities.City;


@Transactional
@Repository
public interface AreaRepository extends JpaRepository<Area, Integer> {
	
	@Query("select a from Area a where cityid = :cityid")
	public List<Area> getBycity(City cityid);

}
