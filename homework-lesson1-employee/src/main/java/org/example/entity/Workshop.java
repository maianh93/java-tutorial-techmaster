package org.example.entity;


import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Workshop {
    long id;
    String name;
    String description;
    double coefficient;
}
