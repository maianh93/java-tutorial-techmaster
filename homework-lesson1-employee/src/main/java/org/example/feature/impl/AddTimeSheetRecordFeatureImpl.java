package org.example.feature.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.entity.TimeSheetRecord;
import org.example.feature.AddTimeSheetRecordFeature;
import org.example.repo.TimeSheetRecordRepo;

@RequiredArgsConstructor
@Slf4j
public class AddTimeSheetRecordFeatureImpl implements AddTimeSheetRecordFeature {

    @Override
    public void process(TimeSheetRecord timeSheetRecord, TimeSheetRecordRepo timeSheetRecordRepo) {
        log.info("timeSheetRecord: {}", timeSheetRecord);
        timeSheetRecordRepo.save(timeSheetRecord);
    }
}
