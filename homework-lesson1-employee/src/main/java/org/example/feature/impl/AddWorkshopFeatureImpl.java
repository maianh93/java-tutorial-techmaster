package org.example.feature.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.entity.Workshop;
import org.example.feature.AddWorkshopFeature;
import org.example.repo.WorkshopRepo;

@RequiredArgsConstructor
@Slf4j
public class AddWorkshopFeatureImpl implements AddWorkshopFeature {
    @Override
    public void process(Workshop workshop, WorkshopRepo workshopRepo) {
        log.info("workshop: {}", workshop);
        workshopRepo.save(workshop);
    }
}
