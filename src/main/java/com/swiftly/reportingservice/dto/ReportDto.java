package com.swiftly.reportingservice.dto;

import com.swiftly.reportingservice.model.enums.ReportStatus;
import com.swiftly.reportingservice.model.enums.ReportType;
import jakarta.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReportDto {
    @NotBlank
    private Long reportId;

    @NotBlank
    private ReportType reportType;

    @NotBlank
    private LocalDateTime generatedAt;

    @NotBlank
    private ReportStatus reportStatus;

    @NotBlank
    private String downloadLink;
}
