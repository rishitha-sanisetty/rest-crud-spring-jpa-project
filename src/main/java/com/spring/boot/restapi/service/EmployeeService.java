package com.spring.boot.restapi.service;

import com.spring.boot.restapi.entity.Employee;

public interface EmployeeService {

    Employee getEmployeeById(long id);

    Employee addEmployee(Employee employee);

    Employee updateEmployee(Employee employee, long id);

    void deleteEmployee(long id);

}