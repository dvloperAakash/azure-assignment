package com.nagarro.javatraining.azure.repository;

import com.nagarro.javatraining.azure.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
