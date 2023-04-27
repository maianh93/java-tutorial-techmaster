package org.example.feature;

import org.example.entity.Workshop;
import org.example.repo.WorkshopRepo;

public interface AddWorkshopFeature {
    void process(Workshop workshop, WorkshopRepo workshopRepo);
}
