
package cabInvoiceGenerator;

import java.util.List;

/**
 * Problem Statement:
 * Calculate cab fares based on distance and time, apply
 * the minimum fare, and calculate the combined fare
 * for multiple rides.
 *
 * Author: Hemang
 * Date: 22-10-2026
 */

// [Hemang]: Calculate individual and multiple ride fares
public class CabInvoiceGenerator {

    public double calculateFare(double distance, int time) {
        double totalFare = (distance * 10) + time;
        return Math.max(totalFare, 5);
    }

    public double calculateTotalFare(List<Ride> rides) {
        double totalFare = 0;

        for (Ride ride : rides) {
            totalFare += calculateFare(
                    ride.getDistance(),
                    ride.getTime()
            );
        }

        return totalFare;
    }
}
