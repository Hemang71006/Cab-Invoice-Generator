
package cabInvoiceGenerator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Problem Statement:
 * Verify that the invoice service retrieves rides
 * for the correct user and generates their invoice.
 *
 * Author: Hemang
 * Date: 22-10-2026
 */

// [Hemang]: Test invoice service using user IDs
class InvoiceServiceTest {

    @Test
    void givenUserWithMultipleRides_shouldReturnTheirInvoice() {
        RideRepository repository = new RideRepository();
        CabInvoiceGenerator generator = new CabInvoiceGenerator();
        InvoiceService service =
                new InvoiceService(repository, generator);

        repository.addRide("USER1", new Ride(2.0, 5));
        repository.addRide("USER1", new Ride(3.0, 10));

        Invoice invoice = service.getInvoice("USER1");

        assertEquals(2, invoice.getTotalRides());
        assertEquals(65.0, invoice.getTotalFare());
        assertEquals(32.5, invoice.getAverageFare());
    }

    @Test
    void givenUserWithoutRides_shouldReturnEmptyInvoice() {
        RideRepository repository = new RideRepository();
        CabInvoiceGenerator generator = new CabInvoiceGenerator();
        InvoiceService service =
                new InvoiceService(repository, generator);

        Invoice invoice = service.getInvoice("UNKNOWN");

        assertEquals(0, invoice.getTotalRides());
        assertEquals(0.0, invoice.getTotalFare());
        assertEquals(0.0, invoice.getAverageFare());
    }
}

