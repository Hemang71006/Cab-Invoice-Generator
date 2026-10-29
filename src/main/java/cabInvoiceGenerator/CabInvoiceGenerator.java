
package cabInvoiceGenerator;

/**
 * Problem Statement:
 * Calculate the cab fare based on the distance travelled
 * and time taken, applying the minimum fare when necessary.
 *
 * Author: Hemang
 * Date: 22-10-2026
 */

public class CabInvoiceGenerator {

    public double calculateFare(double distance, int time) {
        double totalFare = (distance * 10) + (time * 1);
        return Math.max(totalFare, 5);
    }
}

