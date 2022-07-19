package com.example.hibernatesample.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.hibernatesample.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUserId(String userId);

    @Modifying
    @Query("update User set password = :password where id = :user_id")
    void changePassword(@Param("user_id") String userId, @Param("password") String password);

    @Modifying
    @Query("delete from User where id = :user_id")
    void deleteUser(@Param("user_id") String userId);
    
}
