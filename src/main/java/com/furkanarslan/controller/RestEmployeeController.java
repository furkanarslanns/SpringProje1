package com.furkanarslan.controller;

import com.furkanarslan.entitiy.Employee;
import com.furkanarslan.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/api")
public class RestEmployeeController {
    @Autowired
    EmployeeService employeeService;

@GetMapping(path = "/emplooyeeList")
    public List<Employee> getAllEmployees() {


        return employeeService.getAllEmployees();
    }

}
