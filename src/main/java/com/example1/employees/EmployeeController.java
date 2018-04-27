package com.example1.employees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;
    @GetMapping(value = "/employees")
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @PostMapping(value = "/addEmployee")
    public String addEmployee(@RequestParam String name,@RequestParam int age,@RequestParam String gender) {
          Employee newEmployee= new Employee();
          newEmployee.setName(name);
          newEmployee.setAge(age);
          newEmployee.setGender(gender);
          employeeRepository.save(newEmployee);
          return "add success";
    }

    @PostMapping(value = "/searchEmployee/{id}")
    public Employee searchEmployee(@PathVariable("id") Integer id) {
          return employeeRepository.findById(id).get();
    }

    @PostMapping(value = "/updateEmployee/{id}")
    public String updateEmployee(@PathVariable("id") Integer id,@RequestParam String name,
                               @RequestParam int age,@RequestParam String gender) {
        Employee updateEmployee=new Employee();
        updateEmployee.setName(name);
        updateEmployee.setAge(age);
        updateEmployee.setGender(gender);
        employeeRepository.save(updateEmployee);
        return "update success";
    }


}
