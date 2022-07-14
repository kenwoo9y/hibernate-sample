package com.example.hibernatesample.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hibernatesample.model.User;
import com.example.hibernatesample.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void saveUser(User user) {
        this.userRepository.saveUser(user);
    }

    @Override
    public Optional<User> findByUserId(String userId) {
        return this.userRepository.findByUserId(userId);
    };

    @Override
    @Transactional
    public void changePassword(User user) {
        this.userRepository.changePassword(user);
    }

    @Override
    @Transactional
    public void deleteUser(String userId) {
        this.userRepository.deleteUser(userId);
    }
    
}
