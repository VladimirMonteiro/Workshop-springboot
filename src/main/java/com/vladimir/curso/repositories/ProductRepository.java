package com.vladimir.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.vladimir.curso.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
