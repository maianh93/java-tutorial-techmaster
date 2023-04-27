package org.example.repo;

import org.example.entity.Employee;

import java.util.List;

public interface EmployeeRepo {
    void save(Employee employee);
    Employee findById(long id);
    List<Employee> findAll();
}
