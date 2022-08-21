package com.example.hibernatesample.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users") //not user => because it is reserved.
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_name", unique = true, nullable = false, length = 80)
    private String userName;

    @Column(name = "password", nullable = true, length = 80)
    private String password;

    @Column(name = "email", nullable = true, length = 80)
    private String email;

    @Column(name = "first_name", nullable=true, length=40)
    private String firstName;

    @Column(name = "last_name", nullable=true, length=40)
    private String lastName;

    @Column(name = "created_time", nullable = false)
    private LocalDateTime createdTime;

    @Column(name = "updated_time", nullable = false)
    private LocalDateTime updatedTime;
}
