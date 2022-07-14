package com.example.hibernatesample.service;

import java.util.Optional;

import com.example.hibernatesample.model.User;

public interface UserService {
    void saveUser(User user);
    
    Optional<User> findByUserId(String userId);

    void changePassword(User user);

    void deleteUser(String userId);
}
