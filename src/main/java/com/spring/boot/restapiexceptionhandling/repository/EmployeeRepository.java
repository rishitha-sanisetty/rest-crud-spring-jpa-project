package com.spring.boot.restapiexceptionhandling.repository;

import com.spring.boot.restapiexceptionhandling.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
