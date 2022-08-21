package com.example.hibernatesample.service;

import java.util.List;
import java.util.Optional;

import com.example.hibernatesample.model.User;

public interface UserService {
    void save(User user);
    
    Optional<User> findById(Long userId);

    List<User> findAll();

    void updatePassword(User user);

    void deleteById(Long userId);
}
