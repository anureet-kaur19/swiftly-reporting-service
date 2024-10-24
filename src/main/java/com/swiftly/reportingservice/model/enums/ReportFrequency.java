package com.swiftly.reportingservice.model.enums;

import lombok.Getter;

@Getter
public enum ReportFrequency {
    DAILY("Daily"),
    WEEKLY("Weekly"),
    MONTHLY("Monthly"),
    YEARLY("Yearly"),
    CUSTOM("Custom");

    private final String reportFrequency;

    ReportFrequency(String reportFrequency) {this.reportFrequency = reportFrequency;}

}

