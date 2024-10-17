package com.jakarta_course.cdi.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CarOwner {
    private String firstName;
    private Integer age;
    private String brand;
    private String number;
}
