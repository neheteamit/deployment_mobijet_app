package com.example.demo.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.CustomerRequest;
import com.example.demo.entities.Solution;
@Transactional
@Repository
public interface SolutionRepository extends JpaRepository<Solution, Integer> {

	@Query("select s from Solution s where reqid= :reqid")
	public Solution getByreqid(CustomerRequest reqid);
}
