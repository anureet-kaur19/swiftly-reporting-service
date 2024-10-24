package com.swiftly.reportingservice.model;

import com.swiftly.reportingservice.model.enums.ReportStatus;
import com.swiftly.reportingservice.model.enums.ReportType;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "reports")
public class Report {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reportId;

    private ReportType reportType;

    private LocalDateTime generatedAt;

    private ReportStatus reportStatus;

    private String downloadLink;

}


