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
public Employee getEmployeeById(String id) {
    return employeeRepository.getEmployeeId(id);
}
 public List<Employee> getEmployeeWithParams (String firstName, String lastName) {

return employeeRepository.getEmployeesWithParams(firstName, lastName);
 }

 public  Employee saveEmployee(Employee newEmployee) {
    return employeeRepository.saveEmployee(newEmployee);
 }
public boolean deleteEmployee(String id) {
    return employeeRepository.deleteEmployee(id);
}
public Employee updateEmployee(String id, Employee updatedEmployee) {
    return employeeRepository.updateEmployee(updatedEmployee, id);
}

}
