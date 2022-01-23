package com.example.relationships.onetoone.repository;

import com.example.relationships.onetoone.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
