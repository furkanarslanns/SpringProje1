package com.furkanarslan.repository;

import com.furkanarslan.entitiy.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepository {

    @Autowired
    private List<Employee> employeesList;

    public List<Employee> getAllEmployees() {
        return employeesList;
    }

    public Employee getEmployeeId(String id) {
        Employee findEmployee = null;
        for (Employee employee : employeesList) {
            if (id.equals(employee.getId())) {
                findEmployee = employee;

                break;
            }
        }
        return findEmployee;

    }

    public List<Employee> getEmployeesWithParams(String firstName, String lastName) {
        List<Employee> employeesWithParams = new ArrayList<>();
        if (firstName == null && lastName == null) {
            return employeesWithParams;
        }
        for (Employee employee : employeesList) {
            if (firstName != null && lastName != null) {
                if (employee.getFirstName().equalsIgnoreCase(firstName) && employee.getLastName().equalsIgnoreCase(lastName)) {
                    employeesWithParams.add(employee);
                }
            }
            if (firstName != null && lastName == null) {
                employeesWithParams.add(employee);
            }
            if (firstName == null && lastName != null) {
                employeesWithParams.add(employee);
            }

        }
        return employeesWithParams;
    }
    public Employee saveEmployee(Employee newEmployee) {
employeesList.add(newEmployee);
return newEmployee;
    }
    public boolean deleteEmployee(String id) {
        Employee deleteEmployee =null;
        for (Employee employee : employeesList) {
            if(id.equals(employee.getId())) {
                deleteEmployee = employee;
                break;
            }

        }
        if(deleteEmployee==null)
        {  return false;
        }
        employeesList.remove(deleteEmployee);
        return true;
    }
private Employee findEmployeebyID(String id) {
        Employee findEmployee = null;
        for (Employee employee : employeesList) {
            if (employee.getId().equals(id))  {
                findEmployee = employee;
                break;
            }
        }  return findEmployee;
}
    public Employee updateEmployee(Employee updateEmployee, String id) {
Employee employee = findEmployeebyID(id);
if (updateEmployee != null) {
    employee.setFirstName(updateEmployee.getFirstName());
    employee.setLastName(updateEmployee.getLastName());
    employeesList.add(updateEmployee);
}

return null;

    }
}
