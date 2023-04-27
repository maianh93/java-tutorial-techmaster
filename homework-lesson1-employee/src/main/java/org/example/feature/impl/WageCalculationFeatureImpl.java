package org.example.feature.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.entity.TimeSheetRecord;
import org.example.feature.WageCalculationFeature;

import java.util.List;

@RequiredArgsConstructor
@Slf4j
public class WageCalculationFeatureImpl implements WageCalculationFeature {
    @Override
    public void process(List<TimeSheetRecord> timeSheetRecordList) {

    }
}
