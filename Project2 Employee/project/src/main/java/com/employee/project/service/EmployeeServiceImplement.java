package com.employee.project.service;

import com.employee.project.Dao.EmployeeDao;
import com.employee.project.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImplement implements EmployeeServiceInt {

    @Autowired

    private EmployeeDao e;
    @Override
    public List<Employee> FindAllEmployee() {

        return e.findAll();
    }

    @Override
    public Optional<Employee> FindEmployeeByID(int id) {
        return e.findById(id);
    }

    @Override
    public Employee UpdateEmployee(Employee e1) {
        return e.save(e1);
    }

    @Override
    public Employee SaveEmployee(Employee e1) {
        return e.save(e1);
    }

    @Override
    public void deleteEmployee(Integer id) {

        e.deleteById(id);
    }
}
