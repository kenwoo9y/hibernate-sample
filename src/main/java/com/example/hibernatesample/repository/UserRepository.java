package com.example.hibernatesample.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hibernatesample.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUserId(String userId);

    void changePassword(User user);

    void deleteUser(String userId);
    
}
