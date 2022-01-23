package com.example.relationships.manytomany.repository;

import com.example.relationships.manytomany.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
