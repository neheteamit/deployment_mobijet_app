package com.example.demo.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Rating;
@Transactional
@Repository
public interface RatingRepository extends JpaRepository<Rating, Integer> {

}
