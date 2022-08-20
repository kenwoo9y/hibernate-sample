package com.example.hibernatesample.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.hibernatesample.model.User;
import com.example.hibernatesample.repository.UserRepository;

public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void save(User user) {
        this.userRepository.save(user);
    }

    @Override
    public Optional<User> findById(Long userId) {
        return this.userRepository.findById(userId);
    }

    @Override
    public List<User> findAll() {
        return this.userRepository.findAll();
    }

    @Override
    @Transactional
    public void updatePassword(Long userId, String password) {
        this.userRepository.updatePassword(userId, password);
    }

    @Override
    @Transactional
    public void deleteById(Long userId) {
        this.userRepository.deleteById(userId);
    }

    
}
