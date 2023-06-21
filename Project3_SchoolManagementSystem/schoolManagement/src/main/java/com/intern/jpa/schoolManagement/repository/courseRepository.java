package com.intern.jpa.schoolManagement.repository;

import com.intern.jpa.schoolManagement.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface courseRepository extends JpaRepository<Course,Integer> {
}
