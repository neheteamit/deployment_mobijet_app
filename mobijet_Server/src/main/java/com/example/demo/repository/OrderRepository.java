package com.example.demo.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Order;
@Transactional
@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

}
