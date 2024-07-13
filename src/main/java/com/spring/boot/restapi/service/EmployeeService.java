package com.spring.boot.restapi.service;

import com.spring.boot.restapi.entity.Employee;

public interface EmployeeService {

    Employee getEmployeeById(long id) throws Exception;

    Employee addEmployee(Employee employee) throws Exception;

    Employee updateEmployee(Employee employee, long id) throws Exception;

    void deleteEmployee(long id) throws Exception;

}