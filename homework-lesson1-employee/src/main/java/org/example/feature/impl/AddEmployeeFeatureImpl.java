package org.example.feature.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.entity.Employee;
import org.example.feature.AddEmployeeFeature;
import org.example.repo.EmployeeRepo;

@RequiredArgsConstructor
@Slf4j
public class AddEmployeeFeatureImpl implements AddEmployeeFeature {
    @Override
    public void process(Employee employee, EmployeeRepo employeeRepo) {
        log.info("employee: {}", employee);
        employeeRepo.save(employee);
    }
}
