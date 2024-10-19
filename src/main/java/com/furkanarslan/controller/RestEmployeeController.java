package com.furkanarslan.controller;

import com.furkanarslan.entitiy.Employee;
import com.furkanarslan.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;
import java.util.List;

@RestController
@RequestMapping("/list/api/employee")
public class RestEmployeeController {
    @Autowired
    EmployeeService employeeService;

@GetMapping(path = "/list")
    public List<Employee> getAllEmployees() {


        return employeeService.getAllEmployees();
    }
@GetMapping(path = "/list/{id}")
    public Employee getEmployeeById(@PathVariable( name ="id", required = true) String id) {
    return employeeService.getEmployeeById(id);

    }
    @GetMapping(path ="/with-params" )
    public List<Employee>  getEmployeeWithParams(@RequestParam( name = "firstName",required = false) String firstName,
                                                 @RequestParam(name = "lastName",required = false) String lastName)
    {
System.out.println(firstName + " " + lastName);
return employeeService.getEmployeeWithParams(firstName,lastName);

    }
   @PostMapping(path = "/save-employee")
    public Employee saveEmployee(@RequestBody Employee newEmployee) {
    return employeeService.saveEmployee(newEmployee);
   }
   @DeleteMapping(path = "/delete-employee/{id}")
 public boolean  deleteEmploee(@PathVariable(name = "id")String id ) {

    return employeeService.deleteEmployee(id);
 }
 @PutMapping(path = "/update-employee/{id}")
 public Employee updateEmployee(@PathVariable(name = "id") String id ,  @RequestBody Employee updatedEmployeeRequest) {


return employeeService.updateEmployee(id,updatedEmployeeRequest);
 }

}
