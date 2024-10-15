package com.example.employeemanagement.repository;

import com.example.employeemanagement.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    @Query("SELECT e FROM Employee e WHERE  e.department = :department AND EXTRACT(YEAR FROM e.hireDate) = :year ")
    List<Employee>findEmployeesByDepartmentAndHireYear( @Param("department")String department,@Param("year")int year);
}
