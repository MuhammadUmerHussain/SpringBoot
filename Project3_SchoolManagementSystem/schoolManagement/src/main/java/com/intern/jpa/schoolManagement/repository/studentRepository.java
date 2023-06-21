package com.intern.jpa.schoolManagement.repository;

import com.intern.jpa.schoolManagement.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Modifying;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface studentRepository extends JpaRepository<Student, Long> {

    //QueryCreationSpringDocumentation 54:50
    public List<Student> findByFirstName(String firstName);
    public List<Student> findByFirstNameContaining(String name);
    public List<Student> findByGName(String name);

    //JPQL

    @Query("select s from Student s where s.email=?1")
    public List<Student> findByEmail(String email);

    @Query(
            value="SELECT * FROM student_p s where s.email=?1",
            nativeQuery = true
    )
    public List<Student> NativeQuery(String email);

    @Transactional
    @Modifying
    @Query(
            value="UPDATE student_p SET first_name=?1 WHERE email=?2"
            , nativeQuery = true
    )

    public int updateByEmail(String name,String email);

}
