package com.vladimir.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vladimir.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
