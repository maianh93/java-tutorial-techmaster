package org.example.feature;

import org.example.entity.Employee;
import org.example.repo.EmployeeRepo;

public interface AddEmployeeFeature {
    void process(Employee employee, EmployeeRepo employeeRepo);
}
