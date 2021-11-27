package com.example.amigo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.amigo.domain.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);
}
