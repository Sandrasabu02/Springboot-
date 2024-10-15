package com.example.employeemanagement.entity;


import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name= "Employee")
public class Employee {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String name;
    private String department;
    @Column(name="hire_date")
    private LocalDate hireDate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }
    public Integer getHireYear() {
        return hireDate != null ? hireDate.getYear() : null;
    }
}
