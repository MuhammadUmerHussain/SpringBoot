package com.intern.jpa.schoolManagement.repository;

import com.intern.jpa.schoolManagement.entities.CourseMaterial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface courseRepositoryMaterial extends JpaRepository<CourseMaterial,Integer> {


}
