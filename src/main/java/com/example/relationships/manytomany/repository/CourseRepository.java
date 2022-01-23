package com.example.relationships.manytomany.repository;

import com.example.relationships.manytomany.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Long> {
}
