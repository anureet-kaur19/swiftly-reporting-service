package com.swiftly.reportingservice.model.enums;

import lombok.Getter;

@Getter
public enum ReportType {
    TRANSACTION_SUMMARY("Transaction Summary"),
    ACCOUNT_OVERVIEW("Account Overview"),
    ACCOUNT_STATEMENTS("Account Statements"),
    USER_ACTIVITY("User Activity"),
    BALANCE_HISTORY("Balance History");

    private final String reportType;

    ReportType(String reportType) {this.reportType = reportType;}
}

