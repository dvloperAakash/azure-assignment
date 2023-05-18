package com.nagarro.javatraining.azure.controller;

import com.nagarro.javatraining.azure.model.Employee;
import com.nagarro.javatraining.azure.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;
    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeRepository.save(employee);
    }
    @GetMapping("/all")
    public List<Employee> getEmployee() {
        return employeeRepository.findAll();
    }
}
