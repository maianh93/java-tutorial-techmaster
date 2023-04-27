package org.example.feature.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.feature.ListWorkshopFeature;
import org.example.repo.WorkshopRepo;

@RequiredArgsConstructor
@Slf4j
public class ListWorkshopFeatureImpl implements ListWorkshopFeature {
    @Override
    public void process(WorkshopRepo workshopRepo) {
        log.info("All Workshops: {}", workshopRepo.findAll());
    }
}
