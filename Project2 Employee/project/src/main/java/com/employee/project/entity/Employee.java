package com.employee.project.entity;

import javax.persistence.*;

@Entity
@Table(name="employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="emp_id")
    private int id;


    @Column(name="emp_name")
    private String name;
    @Column(name="emp_gender")
    private String gender;

    @Column(name="emp_address")
    private String address;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public Employee() {

    }

    public Employee(int id, String name, String gender, String address) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.address = address;
    }


}
