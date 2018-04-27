package com.example1.employees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;
    @PostMapping(value = "/employees")
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

}
