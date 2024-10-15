package com.example.employeemanagement.service;

import com.example.employeemanagement.entity.Employee;
import com.example.employeemanagement.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    public List<Employee> getEmployeesByDepartmentAndHireYear(String department,int year){

        return employeeRepository.findEmployeesByDepartmentAndHireYear(department,year);
    }

    public List<Employee> findAllEmployees() {
        return employeeRepository.findAll();
    }
}
