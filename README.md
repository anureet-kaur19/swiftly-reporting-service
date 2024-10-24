# swiftly-reporting-service

Handle report generation, retrieval, storage (MongoDB) and management.

## APIs
Note: base endpoint: /api/reports

### GET /
* Purpose: List all available reports.
* Description: Retrieves a list of all generated reports, optionally filtered by report type, date range, or user.

### GET /{reportId}
* Purpose: Retrieve a specific report.
* Description: Fetches a previously generated report using its ID and returns the report content or a download link.

### POST /generate
* Purpose: Generate a new report.
* Description: Creates a report based on specified criteria (e.g., date range, account type) and stores the generated report in a predefined format (PDF, CSV).
* Parameters:
reportType (e.g., transaction summary, account overview ...),
startDate and endDate (for time-based reports),
accountId or userId (optional filters)

### DELETE /{reportId}
* Purpose: Delete a specific report.
* Description: Removes a report from the system based on the provided report ID.

### GET /status/{reportId}
* Purpose: Check the generation status of a report.
* Description: Returns the current status of a report (e.g., pending, completed, failed).

### POST /schedule
* Purpose: Schedule a recurring report generation.
* Description: Sets up a scheduled task to generate reports at specified intervals (e.g., daily, weekly).
* Parameters: reportType, frequency, startDate, endDate
