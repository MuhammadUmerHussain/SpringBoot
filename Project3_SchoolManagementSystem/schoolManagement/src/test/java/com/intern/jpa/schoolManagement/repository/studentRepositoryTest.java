package com.intern.jpa.schoolManagement.repository;

import com.intern.jpa.schoolManagement.entities.Gurdian;
import com.intern.jpa.schoolManagement.entities.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    private studentRepository std;

    @Test
    public void saveStudent()
    {
        Student s= Student.builder().firstName("Umer").lastName("Hussain").email("umer231")
                //.gurdianName("Shahid").gurdianMobile("ads")
                .build();

        std.save(s);

    }
    @Test
    public void GurdianTest()
    {
        Gurdian g1=Gurdian.builder().name("Shahid").email("shahd").mobile("adsad").build();

        Student s=Student.builder().firstName("u2").lastName("asd").email("33").g(g1).build();

        std.save(s);
    }
    @Test
    public void allStudent()
    {
        List<Student> s1= std.findAll();
        System.out.println(s1);

    }
    @Test
    public void findFirstName()
    {
        List<Student> s1= std.findByFirstName("Umer");
        System.out.println(s1);

    }
    @Test
    public void findFirstNameContain()
    {
        List<Student> s1= std.findByFirstNameContaining("u");
        System.out.println(s1);

    }
    @Test
    public void findFirstNameGurdian()
    {
        List<Student> s1= std.findByGName("Shahid");
        System.out.println(s1);

    }

    @Test
    public void findbyEmail()
    {
        List<Student> s1= std.findByEmail("umer231");
        System.out.println(s1);

     }

    @Test
    public void NativeQuery()
    {
        List<Student> s1= std.NativeQuery("umer231");
        System.out.println(s1);

    }

}