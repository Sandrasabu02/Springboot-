package com.example.employeemanagement.controller;


import com.example.employeemanagement.entity.Employee;
import com.example.employeemanagement.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @GetMapping("")
    public List<Employee> getAllEmployees(){
        return employeeService.findAllEmployees();
    }
    @GetMapping("/{department}/{year}")
    public List<Employee> getEmployeeByDepartmentAndHireYear(@PathVariable String department,@PathVariable int year){
        return employeeService.getEmployeesByDepartmentAndHireYear(department,year);
    }
}
