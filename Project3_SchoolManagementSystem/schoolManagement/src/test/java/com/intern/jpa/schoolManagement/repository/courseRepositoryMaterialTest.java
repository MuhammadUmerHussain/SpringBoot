package com.intern.jpa.schoolManagement.repository;

import com.intern.jpa.schoolManagement.entities.Course;
import com.intern.jpa.schoolManagement.entities.CourseMaterial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class courseRepositoryMaterialTest {


    @Autowired
    courseRepositoryMaterial c2;

    @Test
    public void saveData()
    {
        Course c1= Course.builder().title("React").credit("3").build();

        //casecade to give permission as it is not save in db

        CourseMaterial m= CourseMaterial.builder().URL("xyz").c(c1).build();

        c2.save(m);


    }

}