package org.example.feature.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.entity.Employee;
import org.example.feature.AddEmployeeFeature;
import org.example.feature.ListEmployeeFeature;
import org.example.repo.EmployeeRepo;

@RequiredArgsConstructor
@Slf4j
public class ListEmployeeFeatureImpl implements ListEmployeeFeature {
    @Override
    public void process(EmployeeRepo employeeRepo) {
        log.info("All Employees: {}", employeeRepo.findAll());
    }
}
