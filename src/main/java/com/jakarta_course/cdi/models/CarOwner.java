package com.jakarta_course.cdi.models;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CarOwner {
    @NotBlank(message = "The name field cannot be empty!")
    private String firstName;
    @NotNull(message = "The age field cannot be empty!")
    private Integer age;
    @NotBlank(message = "The brand field cannot be empty!")
    private String brand;
    @NotBlank(message = "The number field cannot be empty!")
    private String number;
}
