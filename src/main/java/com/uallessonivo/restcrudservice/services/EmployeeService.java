package com.uallessonivo.restcrudservice.services;

import com.uallessonivo.restcrudservice.entities.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
    Employee findById(int theId);
    Employee save(Employee theEmployee);
    void deleteById(int theId);
}
