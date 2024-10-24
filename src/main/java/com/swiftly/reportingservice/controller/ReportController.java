package com.swiftly.reportingservice.controller;

import java.util.List;

import com.swiftly.reportingservice.dto.ReportDto;
import com.swiftly.reportingservice.dto.ReportRequestDto;
import com.swiftly.reportingservice.dto.ReportScheduleRequestDto;
import com.swiftly.reportingservice.model.enums.ReportStatus;
import com.swiftly.reportingservice.service.ReportGenerationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/reports")
public class ReportController {

    @Autowired
    private ReportGenerationService reportGenerationService;

    @GetMapping
    public ResponseEntity<List<ReportDto>> listReports() {
        List<ReportDto> reports = reportGenerationService.getAllReports();
        return ResponseEntity.ok(reports);
    }

    @GetMapping("/{reportId}")
    public ResponseEntity<ReportDto> getReport(@PathVariable Long reportId) {
        ReportDto report = reportGenerationService.getReportById(reportId);
        return ResponseEntity.ok(report);
    }

    @PostMapping("/generate")
    public ResponseEntity<String> generateReport(@RequestBody ReportRequestDto reportRequest) {
        Long reportId = reportGenerationService.generateReport(reportRequest);
        return ResponseEntity.ok("Report generated with ID: " + reportId);
    }

    @DeleteMapping("/{reportId}")
    public ResponseEntity<String> deleteReport(@PathVariable Long reportId) {
        reportGenerationService.deleteReport(reportId);
        return ResponseEntity.ok("Report deleted successfully");
    }

    @GetMapping("/status/{reportId}")
    public ResponseEntity<ReportStatus> getReportStatus(@PathVariable Long reportId) {
        ReportStatus status = reportGenerationService.getReportStatus(reportId);
        return ResponseEntity.ok(status);
    }

    @PostMapping("/schedule")
    public ResponseEntity<String> scheduleReport(@RequestBody ReportScheduleRequestDto scheduleRequest) {
        reportGenerationService.scheduleReport(scheduleRequest);
        return ResponseEntity.ok("Report scheduled successfully");
    }
}


