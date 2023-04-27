package org.example.repo;

import org.example.entity.Workshop;

import java.util.List;

public interface WorkshopRepo {
    void save(Workshop workshop);
    Workshop findById(long id);
    List<Workshop> findAll();
}
