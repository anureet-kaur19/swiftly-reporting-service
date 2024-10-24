package com.swiftly.reportingservice.dto;

import com.swiftly.reportingservice.model.enums.ReportType;
import jakarta.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReportRequestDto {

    @NotBlank
    private ReportType reportType;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private String accountId;

    private String userId;
}
