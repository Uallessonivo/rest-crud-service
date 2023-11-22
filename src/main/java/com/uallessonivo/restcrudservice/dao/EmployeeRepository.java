package com.uallessonivo.restcrudservice.dao;

import com.uallessonivo.restcrudservice.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
