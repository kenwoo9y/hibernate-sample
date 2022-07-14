package com.example.hibernatesample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hibernatesample.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
