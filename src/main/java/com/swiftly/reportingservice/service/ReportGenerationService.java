package com.swiftly.reportingservice.service;

import com.swiftly.reportingservice.dto.ReportDto;
import com.swiftly.reportingservice.dto.ReportRequestDto;
import com.swiftly.reportingservice.dto.ReportScheduleRequestDto;
import com.swiftly.reportingservice.model.enums.ReportStatus;

import java.util.List;

public interface ReportGenerationService {

    List<ReportDto> getAllReports();

    ReportDto getReportById(Long reportId);

    Long generateReport(ReportRequestDto reportRequest);

    void deleteReport(Long reportId);


    ReportStatus getReportStatus(Long reportId);

    void scheduleReport(ReportScheduleRequestDto scheduleRequest);

}
