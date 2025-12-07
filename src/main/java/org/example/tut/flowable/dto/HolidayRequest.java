package org.example.tut.flowable.dto;

import lombok.Data;

@Data
public class HolidayRequest {

    private String empName;

    private Long noOfHolidays;

    private String requestDescription;

}