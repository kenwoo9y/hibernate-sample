package com.example.hibernatesample.service;

import java.time.LocalDateTime;
import java.util.List;
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
    public void save(User user) {
        user.setCreatedTime(LocalDateTime.now());
        user.setUpdatedTime(LocalDateTime.now());
        
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
    public void updatePassword(User user) {
        user.setUpdatedTime(LocalDateTime.now());

        this.userRepository.updatePassword(user.getId(), user.getPassword(), user.getUpdatedTime());
    }

    @Override
    @Transactional
    public void deleteById(Long userId) {
        this.userRepository.deleteById(userId);
    }

    
}
