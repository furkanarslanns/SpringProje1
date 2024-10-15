package com.furkanarslan.services;

import com.furkanarslan.entitiy.Employee;
import com.furkanarslan.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
@Autowired
EmployeeRepository employeeRepository;

public List<Employee> getAllEmployees() {

    return employeeRepository.getAllEmployees();
}



}
