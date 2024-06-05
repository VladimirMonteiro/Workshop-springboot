package com.vladimir.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vladimir.curso.entities.OrderItem;
import com.vladimir.curso.entities.pk.OrderItemPk;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk> {
    
}
