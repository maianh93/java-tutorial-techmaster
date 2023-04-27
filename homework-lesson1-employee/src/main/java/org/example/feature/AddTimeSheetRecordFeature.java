package org.example.feature;

import org.example.entity.TimeSheetRecord;
import org.example.repo.TimeSheetRecordRepo;

public interface AddTimeSheetRecordFeature {
    void process(TimeSheetRecord timeSheetRecord, TimeSheetRecordRepo timeSheetRecordRepo);
}
