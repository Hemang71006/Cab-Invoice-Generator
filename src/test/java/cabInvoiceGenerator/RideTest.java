
package cabInvoiceGenerator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Problem Statement:
 * Verify that ride details are stored and retrieved correctly.
 *
 * Author: Hemang
 * Date: 22-10-2026
 */

// [Hemang]: Test ride details
class RideTest {

    @Test
    void givenRideDetails_shouldStoreDistanceAndTime() {
        Ride ride = new Ride(2.0, 5);

        assertEquals(2.0, ride.getDistance());
        assertEquals(5, ride.getTime());
    }
}

