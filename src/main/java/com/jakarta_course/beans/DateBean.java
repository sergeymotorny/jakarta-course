package com.jakarta_course.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DateBean implements Serializable {
    private static final long serialVersionUID = 1;

    private LocalDateTime currentDate = LocalDateTime.now();
    private LocalDateTime enteredDateAndTime;
}
