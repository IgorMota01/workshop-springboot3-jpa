package com.coursejpa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coursejpa.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
