package com.example.hibernatesample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.hibernatesample.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Modifying
    @Query("update User set password = :password where id = :user_id")
    void updatePassword(@Param("user_id") Long userId, @Param("password") String password);
}
