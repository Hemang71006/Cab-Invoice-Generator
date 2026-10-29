
package cabInvoiceGenerator;

/**
 * Problem Statement:
 * Store the distance and time details of a cab ride
 * so that the fare can be calculated for each ride.
 *
 * Author: Hemang
 * Date: 22-10-2026
 */

// [Hemang]: Represent an individual cab ride
public class Ride {
    private final double distance;
    private final int time;

    public Ride(double distance, int time) {
        this.distance = distance;
        this.time = time;
    }

    public double getDistance() {
        return distance;
    }

    public int getTime() {
        return time;
    }
}
