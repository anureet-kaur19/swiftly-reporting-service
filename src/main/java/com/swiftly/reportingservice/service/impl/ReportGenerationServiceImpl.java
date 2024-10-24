package com.swiftly.reportingservice.service.impl;

import com.swiftly.reportingservice.dto.ReportDto;
import com.swiftly.reportingservice.dto.ReportRequestDto;
import com.swiftly.reportingservice.dto.ReportScheduleRequestDto;
import com.swiftly.reportingservice.model.enums.ReportStatus;
import com.swiftly.reportingservice.service.ReportGenerationService;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ReportGenerationServiceImpl implements ReportGenerationService {

    @Override
    public List<ReportDto> getAllReports() {
        return null;
    }

    @Override
    public ReportDto getReportById(Long reportId) {
        return null;
    }

    @Override
    public Long generateReport(ReportRequestDto reportRequest) {
        return null;
    }

    @Override
    public void deleteReport(Long reportId) {

    }

    @Override
    public ReportStatus getReportStatus(Long reportId) {
        return null;
    }

    @Override
    public void scheduleReport(ReportScheduleRequestDto scheduleRequest) {

    }
}

