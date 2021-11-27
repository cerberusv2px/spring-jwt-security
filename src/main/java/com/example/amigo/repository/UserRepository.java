package com.example.amigo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.amigo.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
