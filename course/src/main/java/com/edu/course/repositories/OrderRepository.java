package com.edu.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.course.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{

}
