package com.furkanarslan.repository;

import com.furkanarslan.entitiy.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeRepository {

@Autowired
    private List<Employee> employeesList;

    public List<Employee> getAllEmployees() {
        return employeesList;
    }
}
