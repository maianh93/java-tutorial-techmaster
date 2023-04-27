package org.example.application;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.entity.Employee;
import org.example.feature.AddEmployeeFeature;
import org.example.feature.ListEmployeeFeature;
import org.example.feature.impl.AddEmployeeFeatureImpl;
import org.example.feature.impl.ListEmployeeFeatureImpl;
import org.example.repo.EmployeeRepo;

import java.util.Scanner;

@Slf4j
@RequiredArgsConstructor
public class EmployeeManagement {
    private static long employeeAutoId = 0;
    private static final String ADD_EMPLOYEE_FEATURE = "1";
    private static final String LIST_ALL_EMPLOYEES_FEATURE = "2";
    private final Scanner systemInScanner;
    private final EmployeeRepo employeeRepo;
    private final AddEmployeeFeature addEmployeeFeature = new AddEmployeeFeatureImpl();
    private final ListEmployeeFeature listEmployeeFeature = new ListEmployeeFeatureImpl();
    public String menuName() {
        return "Quan ly Cong nhan";
    }

    public void doTask() {
        printNotification();
        String choice = systemInScanner.nextLine();
        switch (choice) {
            case ADD_EMPLOYEE_FEATURE:
                Employee employee = inputNewEmployee();
                addEmployeeFeature.process(employee, employeeRepo);
                break;
            case LIST_ALL_EMPLOYEES_FEATURE:
                listEmployeeFeature.process(employeeRepo);
                break;
            default:
                log.info("");
        }
    }

    private Employee inputNewEmployee() {
        long id = generateId();
        log.info("\n-- Nhap Ho ten: ");
        String fullName = systemInScanner.nextLine();
        log.info("\n-- Nhap Dia chi: ");
        String address = systemInScanner.nextLine();
        log.info("\n-- Nhap so dien thoai: ");
        String phoneNumber = systemInScanner.nextLine();
        log.info("\n-- Nhap Cap bac (1-7): ");

        int level = Integer.parseInt(systemInScanner.nextLine());
        return Employee.builder()
                .id(id)
                .fullName(fullName)
                .address(address)
                .phoneNumber(phoneNumber)
                .level(level)
                .build();
    }

    private long generateId() {
        return employeeAutoId++;
    }

    private void printNotification() {
        String notificationFormat = "" + System.lineSeparator() +
                "Lua chon 1 trong cac tinh nang sau" + System.lineSeparator() +
                "%s. %s" + System.lineSeparator() +
                "%s. %s" + System.lineSeparator() +
                "";
        String notification = String.format(notificationFormat,
                ADD_EMPLOYEE_FEATURE,
                "Them Cong nhan",
                LIST_ALL_EMPLOYEES_FEATURE,
                "In toan bo Cong nhan"
        );
        log.info(notification);
    }
}
