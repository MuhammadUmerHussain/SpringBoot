package com.employee.project.Controller;

import com.employee.project.entity.Employee;
import com.employee.project.service.EmployeeServiceInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {

    @Autowired
    EmployeeServiceInt e;

    @GetMapping
    public List<Employee> findAllEmployee()
    {
       return e.FindAllEmployee();
    }

    @GetMapping("/{id}")

    public Optional<Employee> findById(@PathVariable ("id") int id)
    {
        return e.FindEmployeeByID(id);
    }

    @PostMapping
    public Employee saveEmployee(@RequestBody Employee e1)
    {
        return e.SaveEmployee(e1);
    }

    @PutMapping
    public Employee UpdateEmployee(@RequestBody Employee e1)
    {
        return e.UpdateEmployee(e1);
    }

    @DeleteMapping("/{id}")

    public void deleteEmployee(@PathVariable("id") int id)
    {
        e.deleteEmployee(id);
    }

}
