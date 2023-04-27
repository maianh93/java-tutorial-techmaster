package org.example.repo;

import org.example.entity.TimeSheetRecord;

import java.util.List;

public interface TimeSheetRecordRepo {
    void save(TimeSheetRecord timeSheetRecord);
    TimeSheetRecord findById(long id);
    List<TimeSheetRecord> findAll();
}
