package com.swiftly.reportingservice.model.enums;

import lombok.Getter;

@Getter
public enum ReportStatus {
    NEW("New"),
    PENDING("Pending"),
    COMPLETED("Completed"),
    FAILED("Failed");

    private final String reportStatus;

    ReportStatus(String reportStatus) {this.reportStatus = reportStatus; }

}
