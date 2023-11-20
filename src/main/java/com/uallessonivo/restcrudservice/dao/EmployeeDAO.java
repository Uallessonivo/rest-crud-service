package com.uallessonivo.restcrudservice.dao;

import com.uallessonivo.restcrudservice.entities.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
}
