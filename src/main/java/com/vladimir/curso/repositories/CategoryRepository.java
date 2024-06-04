package com.vladimir.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vladimir.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    
}
