package com.swiftly.reportingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.capgemini.aura")
public class Application {
  public static void main(String[] args) {
    System.out.print("Hello and welcome to Swiftly Reporting Service!");
    SpringApplication.run(Application.class, args);
  }

}

// reporting-service/
// │
// ├── src/
// │   ├── main/
// │   │   ├── java/
// │   │   │   └── com/
// │   │   │       └── banking/
// │   │   │           └── reporting/
// │   │   │               ├── ReportingServiceApplication.java  # Main application class
// │   │   │               ├── controller/
// │   │   │               │   └── ReportingController.java      # Handles HTTP requests
// │   │   │               ├── model/
// │   │   │               │   └── Report.java                   # Report entity
// │   │   │               ├── repository/
// │   │   │               │   └── ReportingRepository.java      # MongoDB data access
// │   │   │               ├── service/
// │   │   │               │   └── ReportingService.java         # Business logic
// │   │   │               ├── kafka/
// │   │   │               │   └── TransactionEventListener.java  # Kafka listener for transactions
// │   │   │               └── exception/
// │   │   │                   └── CustomException.java          # Custom exception handling
// │   │   └── resources/
// │   │       └── application.yml                                 # Configuration
// │   └── test/
// │       └── java/
// │           └── com/
// │               └── banking/
// │                   └── reporting/
// │                       └── ReportingServiceApplicationTests.java  # Unit tests
