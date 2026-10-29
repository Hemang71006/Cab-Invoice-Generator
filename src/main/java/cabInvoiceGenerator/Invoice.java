
package cabInvoiceGenerator;

/**
 * Problem Statement:
 * Store invoice details including total number of rides,
 * total fare, and average fare per ride.
 *
 * Author: Hemang
 * Date: 22-10-2026
 */

// [Hemang]: Represent the enhanced cab invoice
public class Invoice {
    private final int totalRides;
    private final double totalFare;
    private final double averageFare;

    public Invoice(int totalRides, double totalFare) {
        this.totalRides = totalRides;
        this.totalFare = totalFare;
        this.averageFare =
                totalRides == 0 ? 0 : totalFare / totalRides;
    }

    public int getTotalRides() {
        return totalRides;
    }

    public double getTotalFare() {
        return totalFare;
    }

    public double getAverageFare() {
        return averageFare;
    }
}

