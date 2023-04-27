package org.example.feature;

import org.example.entity.TimeSheetRecord;

import java.util.List;

public interface WageCalculationFeature {
    void process(List<TimeSheetRecord> timeSheetRecordList);
}
