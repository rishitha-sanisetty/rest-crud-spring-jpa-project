package com.spring.boot.restapiexceptionhandling.service;

import com.spring.boot.restapiexceptionhandling.entity.Employee;

public interface EmployeeService {

    Employee getEmployeeById(long id);

    Employee addEmployee(Employee employee);

    Employee updateEmployee(Employee employee, long id);

    void deleteEmployee(long id);

}