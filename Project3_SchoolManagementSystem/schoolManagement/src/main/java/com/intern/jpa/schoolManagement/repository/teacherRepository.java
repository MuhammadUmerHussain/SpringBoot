package com.intern.jpa.schoolManagement.repository;

import com.intern.jpa.schoolManagement.entities.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface teacherRepository extends JpaRepository<Teacher,Long> {
}
