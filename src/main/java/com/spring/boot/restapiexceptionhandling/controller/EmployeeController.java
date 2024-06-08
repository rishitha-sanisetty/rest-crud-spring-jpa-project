//package com.spring.boot.restapiexceptionhandling.controller;
//
//import com.spring.boot.restapiexceptionhandling.entity.Employee;
//import com.spring.boot.restapiexceptionhandling.service.EmployeeService;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//
//@RestController
//@RequestMapping("/employees")
//public class EmployeeController {
//
//    private EmployeeService employeeService;
//
//    public EmployeeController(EmployeeService employeeService) {
//        this.employeeService = employeeService;
//    }
//
////     build create employee REST API
//    @PostMapping()
//    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
//        return new ResponseEntity<Employee>(employeeService.addEmployee(employee), HttpStatus.CREATED);
//    }
//
//
//    // build get employee by id REST API
//    @GetMapping("{id}")
//    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") long employeeId){
//        return new ResponseEntity<Employee>(employeeService.getEmployeeById(employeeId), HttpStatus.OK);
//    }
//
//
//    // build update employee REST API
//    @PutMapping("{id}")
//    public ResponseEntity<Employee> updateEmployee(@PathVariable("id") long id, @RequestBody Employee employee){
//        return new ResponseEntity<Employee>(employeeService.updateEmployee(employee, id), HttpStatus.OK);
//    }
//
//
//    // build delete employee REST API
//    @DeleteMapping("{id}")
//    public ResponseEntity<String> deleteEmployee(@PathVariable("id") int id){
//
//        // delete employee from DB
//        employeeService.deleteEmployee(id);
//        return new ResponseEntity<String>("Employee deleted successfully!.", HttpStatus.OK);
//    }
//
//}