
package cabInvoiceGenerator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Problem Statement:
 * Verify the total rides, total fare, and average fare
 * stored in an enhanced invoice.
 *
 * Author: Hemang
 * Date: 22-10-2026
 */

// [Hemang]: Test enhanced invoice calculations
class InvoiceTest {

    @Test
    void givenInvoiceDetails_shouldCalculateAverageFare() {
        Invoice invoice = new Invoice(2, 65.0);

        assertEquals(2, invoice.getTotalRides());
        assertEquals(65.0, invoice.getTotalFare());
        assertEquals(32.5, invoice.getAverageFare());
    }

    @Test
    void givenNoRides_shouldReturnZeroAverageFare() {
        Invoice invoice = new Invoice(0, 0.0);

        assertEquals(0, invoice.getTotalRides());
        assertEquals(0.0, invoice.getTotalFare());
        assertEquals(0.0, invoice.getAverageFare());
    }
}
