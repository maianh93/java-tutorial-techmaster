package org.example.application;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.entity.Workshop;
import org.example.feature.AddWorkshopFeature;
import org.example.feature.ListWorkshopFeature;
import org.example.feature.impl.AddWorkshopFeatureImpl;
import org.example.feature.impl.ListWorkshopFeatureImpl;
import org.example.repo.WorkshopRepo;

import java.util.Scanner;

@Slf4j
@RequiredArgsConstructor
public class WorkshopManagement {
    private static long workshopAutoId = 0;

    private static final String ADD_WORKSHOP_FEATURE = "1";
    private static final String LIST_ALL_WORKSHOPS_FEATURE = "2";

    private final WorkshopRepo workshopRepo;

    private final AddWorkshopFeature addWorkshopFeature = new AddWorkshopFeatureImpl();

    private final ListWorkshopFeature listWorkshopFeature = new ListWorkshopFeatureImpl();

    private final Scanner systemInScanner;


    public void start() {

    }

    public String menuName() {
        return "Quan ly Phan xuong";
    }

    public void doTask() {
        printNotification();
        String choice = systemInScanner.nextLine();
        switch (choice) {
            case ADD_WORKSHOP_FEATURE:
                Workshop workshop = inputNewWorkshop();
                addWorkshopFeature.process(workshop, workshopRepo);
                break;
            case LIST_ALL_WORKSHOPS_FEATURE:
                listWorkshopFeature.process(workshopRepo);
                break;
            default:
                log.info("");
        }

    }

    private Workshop inputNewWorkshop() {
        long id = generateId();
        log.info("\n-- Nhap Ten Phan xuong: ");
        String name = systemInScanner.nextLine();
        log.info("\n-- Nhap Mo ta: ");
        String description = systemInScanner.nextLine();
        log.info("\n-- Nhap He so Cong viec: ");
        double coefficient = Integer.parseInt(systemInScanner.nextLine());

        return Workshop.builder()
                .id(id)
                .name(name)
                .description(description)
                .coefficient(coefficient)
                .build();
    }

    private long generateId() {
        return workshopAutoId++;
    }

    private void printNotification() {
        String notificationFormat = "" + System.lineSeparator() +
                "Lua chon 1 trong cac tinh nang sau" + System.lineSeparator() +
                "%s. %s" + System.lineSeparator() +
                "%s. %s" + System.lineSeparator() +
                "";
        String notification = String.format(notificationFormat,
                ADD_WORKSHOP_FEATURE,
                "Them Phan xuong",
                LIST_ALL_WORKSHOPS_FEATURE,
                "In toan bo Phan xuong"
        );
        log.info(notification);
    }
}
