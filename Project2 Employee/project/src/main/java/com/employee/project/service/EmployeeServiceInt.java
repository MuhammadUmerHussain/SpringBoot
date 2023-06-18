package com.employee.project.service;

import com.employee.project.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeServiceInt {

    public List<Employee> FindAllEmployee();
    public Optional<Employee> FindEmployeeByID(int id);
    public Employee UpdateEmployee(Employee e1);
    public Employee SaveEmployee(Employee e1);

    public void deleteEmployee( Integer id);
}
