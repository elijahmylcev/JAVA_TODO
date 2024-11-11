package com.example.TODO.repository;

import com.example.TODO.domain.user.Role;
import com.example.TODO.domain.user.User;

import java.util.Optional;

public interface UserRepository {
    Optional<User> findById(Long id);

    Optional<User> findByUsername(String username);

    void update(User user);

    void create(User user);

    void insertUserRole(Long userId, Role role);

}