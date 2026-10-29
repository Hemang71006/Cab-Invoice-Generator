
package cabInvoiceGenerator;

import java.util.List;

/**
 * Problem Statement:
 * Calculate normal and premium cab fares based on distance
 * and time, apply minimum fares, and generate invoices
 * for multiple rides.
 *
 * Author: Hemang
 * Date: 22-10-2026
 */

// [Hemang]: Calculate fares and generate invoices
public class CabInvoiceGenerator {

    public double calculateFare(double distance, int time) {
        double totalFare = (distance * 10) + time;
        return Math.max(totalFare, 5);
    }

    public double calculateFare(Ride ride) {
        double totalFare;

        if (ride.isPremium()) {
            totalFare = (ride.getDistance() * 15)
                    + (ride.getTime() * 2);
            return Math.max(totalFare, 20);
        }

        return calculateFare(ride.getDistance(), ride.getTime());
    }

    public double calculateTotalFare(List<Ride> rides) {
        double totalFare = 0;

        for (Ride ride : rides) {
            totalFare += calculateFare(ride);
        }

        return totalFare;
    }

    public Invoice calculateInvoice(List<Ride> rides) {
        double totalFare = calculateTotalFare(rides);
        return new Invoice(rides.size(), totalFare);
    }
}
