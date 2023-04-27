package org.example.repo.impl;

import org.example.entity.Employee;
import org.example.repo.EmployeeRepo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeRepoImpl implements EmployeeRepo {
    private final Map<Long, Employee> repo = new HashMap<>();
    @Override
    public void save(Employee employee) {
        repo.put(employee.getId(), employee);
    }

    @Override
    public Employee findById(long id) {
        return repo.get(id);
    }

    @Override
    public List<Employee> findAll() {
        return List.copyOf(repo.values());
    }
}
