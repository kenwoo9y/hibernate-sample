package com.example.hibernatesample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hibernatesample.model.User;
import com.example.hibernatesample.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;
    
    @PostMapping
    public ResponseEntity<?> saveUser(@RequestBody User user) {
        userService.saveUser(user);
        
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<?> findByUserId(@PathVariable("userId") String userId) {
        return new ResponseEntity<>(userService.findByUserId(userId), HttpStatus.OK);
    }

    @PutMapping("/change")
    public ResponseEntity<?> changePassword(@RequestBody User user) {
        userService.changePassword(user);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/delete/{userId}")
    public ResponseEntity<?> deleteUser(@PathVariable("userId") String userId) {
        userService.deleteUser(userId);
        
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
