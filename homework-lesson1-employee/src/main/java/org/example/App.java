package org.example;

import lombok.extern.slf4j.Slf4j;
import org.example.application.*;
import org.example.repo.EmployeeRepo;
import org.example.repo.WorkshopRepo;
import org.example.repo.impl.EmployeeRepoImpl;
import org.example.repo.impl.WorkshopRepoImpl;

import java.util.Scanner;

@Slf4j
public class App {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        EmployeeRepo employeeRepo = new EmployeeRepoImpl();
        WorkshopRepo workshopRepo = new WorkshopRepoImpl();
        EmployeeManagement employeeManagement = new EmployeeManagement(scanner, employeeRepo);
        WorkshopManagement workshopManagement = new WorkshopManagement(workshopRepo, scanner);
        TimeSheetRecordManagement timeSheetRecordManagement = new TimeSheetRecordManagement();
        WageManagement wageManagement = new WageManagement();
        MainMenu mainMenu = new MainMenu(scanner, employeeManagement, timeSheetRecordManagement, workshopManagement, wageManagement);
        while (true) {
            mainMenu.doTask();
        }
    }
}
