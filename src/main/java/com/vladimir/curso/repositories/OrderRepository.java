package com.vladimir.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vladimir.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
    
}
