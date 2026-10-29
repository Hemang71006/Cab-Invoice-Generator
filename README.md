# Cab Invoice Generator using JUnit 5

## Overview

The Cab Invoice Generator is a Java-based application that calculates cab fares based on distance travelled and time taken.

The application supports normal and premium rides, calculates fares for multiple rides, generates enhanced invoices, and retrieves user-specific ride details through an invoice service. JUnit 5 is used to test the fare calculations, invoice generation, and service functionality.

The project covers the five use cases specified in the Cab Invoice Generator assignment, including the premium ride bonus use case.

## Objectives

- Calculate cab fares based on distance and time.
- Apply the minimum fare requirement for normal and premium rides.
- Calculate the combined fare for multiple rides.
- Generate invoices containing total rides, total fare, and average fare per ride.
- Retrieve rides using a user ID and generate the corresponding invoice.
- Implement unit tests using JUnit 5.
- Follow Test-Driven Development (TDD) by writing tests before implementation.
- Follow the Git branching and merging strategy by developing each use case on a separate feature branch.

## Technologies Used

- Java 17
- Maven
- JUnit 5
- Maven Surefire Plugin
- Git and GitHub
- IntelliJ IDEA

## Use Cases Covered

| Use Case | Description | Requirement |
|---|---|---|
| UC 1 | Calculate Fare | Calculate fare at Rs. 10 per kilometre and Rs. 1 per minute, with a minimum fare of Rs. 5. |
| UC 2 | Multiple Rides | Calculate the total fare for multiple rides. |
| UC 3 | Enhanced Invoice | Generate an invoice containing total number of rides, total fare, and average fare per ride. |
| UC 4 | Invoice Service | Retrieve rides using a user ID through a RideRepository and generate the user's invoice. |
| UC 5 | Premium Rides (Bonus) | Calculate premium fares at Rs. 15 per kilometre and Rs. 2 per minute, with a minimum fare of Rs. 20. |

## Fare Structure

| Ride Type | Cost per Kilometre | Cost per Minute | Minimum Fare |
|---|---:|---:|---:|
| Normal | Rs. 10 | Rs. 1 | Rs. 5 |
| Premium | Rs. 15 | Rs. 2 | Rs. 20 |

### Fare Calculation

For a normal ride:

Fare = (Distance × Rs. 10) + (Time × Rs. 1)

For a premium ride:

Fare = (Distance × Rs. 15) + (Time × Rs. 2)

If the calculated fare is below the applicable minimum fare, the minimum fare is charged.

## Testing Approach

JUnit 5 is used to verify the functionality of each use case.

### Unit Tests

- Verify normal fare calculation.
- Verify minimum fare application.
- Verify ride distance and time details.
- Verify total fare for multiple rides.
- Verify invoice ride count, total fare, and average fare.
- Verify user-specific invoice generation.
- Verify premium fare calculation and minimum premium fare.

### Test-Driven Development (TDD)

The project follows the Red-Green-Refactor approach:

1. **Red:** Write a test that initially fails.
2. **Green:** Implement the minimum code required to pass the test.
3. **Refactor:** Improve the implementation while ensuring all tests continue to pass.

## Project Structure

The project follows the standard Maven directory structure:

```text
Cab-Invoice-Generator/
├── README.md
├── .gitignore
├── pom.xml
└── src/
    ├── main/
    │   └── java/
    │       └── cabInvoiceGenerator/
    │           ├── CabInvoiceGenerator.java
    │           ├── Ride.java
    │           ├── Invoice.java
    │           ├── RideRepository.java
    │           └── InvoiceService.java
    └── test/
        └── java/
            └── cabInvoiceGenerator/
                ├── CabInvoiceGeneratorTest.java
                ├── RideTest.java
                ├── InvoiceTest.java
                └── InvoiceServiceTest.java
```

Note: The README is maintained on the `main` branch. The `develop` and feature branches contain the project code and configuration without the README.

## Git Branching Strategy

The project follows a feature-based GitFlow workflow.

### Main Branches

- `main`: Contains the final submission and README documentation.
- `develop`: Contains the initial Maven setup and all completed use cases merged from feature branches.

### Feature Branches

| Branch | Purpose |
|---|---|
| `feature/UC1-Calculate-Fare` | Implement fare calculation and minimum fare. |
| `feature/UC2-Multiple-Rides` | Implement multiple ride fare calculation. |
| `feature/UC3-Enhanced-Invoice` | Implement enhanced invoice generation. |
| `feature/UC4-Invoice-Service` | Implement user-specific invoice service. |
| `feature/UC5-Premium-Rides` | Implement premium ride fare calculation. |

Each feature branch is created from the latest `develop` branch. After implementation and successful testing, the feature branch is merged back into `develop`.

Commit messages follow this format:

```text
[Hemang]: Describe the change
```

## How to Run the Tests

### Prerequisites

- Java Development Kit (JDK) 17 or compatible.
- IntelliJ IDEA with Maven support, or Maven installed separately.

### Run Using Maven

From the project root, execute:

```bash
mvn clean test
```

### Run Using IntelliJ IDEA

1. Open the project in IntelliJ IDEA.
2. Open the Maven tool window.
3. Expand the project and select **Lifecycle**.
4. Run `clean`, followed by `test`.

## Example Calculations

### Normal Ride

Distance = 2 km  
Time = 5 minutes

Fare = (2 × Rs. 10) + (5 × Rs. 1) = Rs. 25

### Premium Ride

Distance = 2 km  
Time = 5 minutes

Fare = (2 × Rs. 15) + (5 × Rs. 2) = Rs. 40

## Conclusion

The Cab Invoice Generator demonstrates fare calculation, multiple ride processing, invoice generation, user-based ride retrieval, and premium fare handling using Java. JUnit 5 tests verify the implementation, while Maven manages the project build and test execution.