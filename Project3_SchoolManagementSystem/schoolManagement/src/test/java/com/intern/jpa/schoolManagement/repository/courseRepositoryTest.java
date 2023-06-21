package com.intern.jpa.schoolManagement.repository;

import com.intern.jpa.schoolManagement.entities.Course;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class courseRepositoryTest {

    @Autowired
    courseRepository cR;
    @Test
    public void findCourse(){

        List<Course> C=cR.findAll();

        System.out.println(C);
    }


}