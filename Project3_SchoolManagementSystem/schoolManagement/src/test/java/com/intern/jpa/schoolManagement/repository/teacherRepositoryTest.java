package com.intern.jpa.schoolManagement.repository;

import com.intern.jpa.schoolManagement.entities.Course;
import com.intern.jpa.schoolManagement.entities.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class teacherRepositoryTest {

    @Autowired
    teacherRepository t;

    @Test
    public void saveTeacher()
    {
        Course c1= Course.builder().title("Native").credit("2").build();
        Course c2= Course.builder().title("Java").credit("2").build();
        Teacher t1= Teacher.builder().firstName("Basit").lastName("Quershi").courseList(List.of(c1,c2)).build();
        t.save(t1);
    }

}