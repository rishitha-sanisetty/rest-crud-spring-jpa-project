package com.spring.boot.restapi.service;

import com.spring.boot.restapi.entity.Employee;
import com.spring.boot.restapi.repository.EmployeeRepository;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee addEmployee(Employee employee) throws Exception {
        Employee existingEmployee = employeeRepository.findById(employee.getId()).orElse(null);

        if (existingEmployee == null) {
            return employeeRepository.save(employee);
        }
        else {
            throw new Exception();
        }
    }

    @Override
    public Employee getEmployeeById(long id) throws Exception {

		Optional<Employee> employee = employeeRepository.findById(id);

        if(employee.isPresent()) {
			return employee.get();
		}else {
			throw new Exception(String.format("Employee %d not found..!!", id));
		}

//        Lambda expression for above impl
//        return employeeRepository.findById(id).orElseThrow(() ->
//                new NoSuchObjectExistsExceptionHandler("Employee", "Id", id));

    }

    @Override
    public Employee updateEmployee(Employee employee, long id) throws Exception {
        // we need to check whether employee with given id exist in DB or not
        Employee existingEmployee = employeeRepository.findById(id)
                .orElseThrow(() -> new Exception(String.format("Employee %d not found..!!", id)));

        existingEmployee.setFirstName(employee.getFirstName());
        existingEmployee.setLastName(employee.getLastName());
        existingEmployee.setEmail(employee.getEmail());

        // save existing employee to DB
        employeeRepository.save(existingEmployee);
        return existingEmployee;

    }

    @Override
    public void deleteEmployee(long id) throws Exception {

        // check whether an employee exist in DB or not
        employeeRepository.findById(id).orElseThrow(() -> new Exception(String.format("Employee %d not found..!!", id)));
        employeeRepository.deleteById(id);
    }

}
