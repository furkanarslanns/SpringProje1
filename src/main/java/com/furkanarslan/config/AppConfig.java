package com.furkanarslan.config;

import com.furkanarslan.entitiy.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {
@Bean
    public List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("1","furkan","arslan"));
        employees.add(new Employee("2","tuğçe","kaplan"));
        employees.add(new Employee("3","fuat","çakır"));
        employees.add(new Employee("4","ece","kılıç"));
        return employees;
    }


}
