package org.example.repo.impl;

import org.example.entity.Workshop;
import org.example.repo.WorkshopRepo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WorkshopRepoImpl implements WorkshopRepo {
    private final Map<Long, Workshop> repo = new HashMap<>();
    @Override
    public void save(Workshop workshop) {
        repo.put(workshop.getId(), workshop);
    }

    @Override
    public Workshop findById(long id) {
        return repo.get(id);
    }

    @Override
    public List<Workshop> findAll() {
        return List.copyOf(repo.values());
    }
}
