package org.example.application;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

@Slf4j
@RequiredArgsConstructor
public class MainMenu {
    private static final String EMPLOYEE_MANAGEMENT_CHOICE = "1";
    private static final String TIMESHEET_RECORD_MANAGEMENT_CHOICE = "2";
    private static final String WORKSHOP_MANAGEMENT_CHOICE = "3";
    private static final String WAGE_MANAGEMENT_CHOICE = "4";
    private final Scanner systemInScanner;
    private final EmployeeManagement employeeManagement;
    private final TimeSheetRecordManagement timeSheetRecordManagement;
    private final WorkshopManagement workshopManagement;
    private final WageManagement wageManagement;

    public void doTask() {
        printNotification();
        String choice = systemInScanner.nextLine();
        switch (choice) {
            case EMPLOYEE_MANAGEMENT_CHOICE:
                employeeManagement.doTask();
                break;
            case TIMESHEET_RECORD_MANAGEMENT_CHOICE:
                timeSheetRecordManagement.doTask();
                break;
            case WORKSHOP_MANAGEMENT_CHOICE:
                workshopManagement.doTask();
                break;
            case WAGE_MANAGEMENT_CHOICE:
                wageManagement.doTask();
                break;
            default:
                log.info("");
        }
    }

    private void printNotification() {
        String notificationFormat = "" + System.lineSeparator() +
                "Lua chon 1 trong cac tinh nang sau" + System.lineSeparator() +
                "%s. %s" + System.lineSeparator() +
                "%s. %s" + System.lineSeparator() +
                "%s. %s" + System.lineSeparator() +
                "%s. %s" + System.lineSeparator() +
                "";
        String notification = String.format(notificationFormat,
                EMPLOYEE_MANAGEMENT_CHOICE,
                employeeManagement.menuName(),
                TIMESHEET_RECORD_MANAGEMENT_CHOICE,
                workshopManagement.menuName(),
                WORKSHOP_MANAGEMENT_CHOICE,
                timeSheetRecordManagement.menuName(),
                WAGE_MANAGEMENT_CHOICE,
                wageManagement.menuName()
                );
        log.info(notification);
    }
}
