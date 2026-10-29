
package cabInvoiceGenerator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;

/**
 * Problem Statement:
 * Test the cab fare calculation using distance and time.
 * Verify that the fare follows the given rates and that
 * the minimum fare is applied when necessary.
 *
 * Author: Hemang
 * Date: 22-10-2026
 */

class CabInvoiceGeneratorTest {

    @Test
    void givenDistanceAndTime_shouldReturnTotalFare() {
        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();

        double fare = cabInvoiceGenerator.calculateFare(2.0, 5);

        assertEquals(25.0, fare);
    }


    @Test
    void givenLowDistanceAndTime_shouldReturnMinimumFare() {
        // Arrange
        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();

        // Act
        double fare = cabInvoiceGenerator.calculateFare(0.2, 1);

        // Assert: Calculated fare is Rs. 3, so minimum fare Rs. 5 applies
        assertEquals(5.0, fare);
    }

    @Test
    void givenFareEqualToMinimumFare_shouldReturnMinimumFare() {
        // Arrange
        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();

        // Act
        double fare = cabInvoiceGenerator.calculateFare(0.4, 1);

        // Assert: (0.4 * 10) + (1 * 1) = Rs. 5
        assertEquals(5.0, fare);
    }


    @Test
    void givenMultipleRides_shouldReturnTotalFare() {
        CabInvoiceGenerator generator = new CabInvoiceGenerator();

        List<Ride> rides = List.of(
                new Ride(2.0, 5),  // Fare = Rs. 25
                new Ride(3.0, 10)  // Fare = Rs. 40
        );

        assertEquals(65.0, generator.calculateTotalFare(rides));
    }

    @Test
    void givenMultipleRides_shouldReturnEnhancedInvoice() {
        CabInvoiceGenerator generator = new CabInvoiceGenerator();

        List<Ride> rides = List.of(
                new Ride(2.0, 5),
                new Ride(3.0, 10)
        );

        Invoice invoice = generator.calculateInvoice(rides);

        assertEquals(2, invoice.getTotalRides());
        assertEquals(65.0, invoice.getTotalFare());
        assertEquals(32.5, invoice.getAverageFare());
    }

}

