package org.example.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
public class TimeSheetRecord {
    long id;
    long employeeId;
    long workshopId;
    long totalDays;
}
