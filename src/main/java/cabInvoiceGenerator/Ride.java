
package cabInvoiceGenerator;

/**
 * Problem Statement:
 * Store the distance, time, and type of a cab ride
 * for calculating normal or premium fares.
 *
 * Author: Hemang
 * Date: 22-10-2026
 */

// [Hemang]: Represent normal and premium cab rides
public class Ride {
    private final double distance;
    private final int time;
    private final boolean premium;

    public Ride(double distance, int time) {
        this(distance, time, false);
    }

    public Ride(double distance, int time, boolean premium) {
        this.distance = distance;
        this.time = time;
        this.premium = premium;
    }

    public double getDistance() {
        return distance;
    }

    public int getTime() {
        return time;
    }

    public boolean isPremium() {
        return premium;
    }
}
