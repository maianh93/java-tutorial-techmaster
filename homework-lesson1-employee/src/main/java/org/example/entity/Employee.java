package org.example.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
public class Employee {
    long id;
    String fullName;
    String address;
    String phoneNumber;
    int level;
}
