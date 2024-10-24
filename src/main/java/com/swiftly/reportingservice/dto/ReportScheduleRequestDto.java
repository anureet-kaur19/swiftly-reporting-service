package com.swiftly.reportingservice.dto;

import com.swiftly.reportingservice.model.enums.ReportFrequency;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ReportScheduleRequestDto {

    @NotBlank
    private String reportType;

    @NotBlank
    private ReportFrequency frequency;

    @NotBlank
    private LocalDateTime startDate;

    @NotBlank
    private LocalDateTime endDate;

}

