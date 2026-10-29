
package cabInvoiceGenerator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Problem Statement:
 * Store and retrieve cab rides associated with each user ID.
 *
 * Author: Hemang
 * Date: 22-10-2026
 */

// [Hemang]: Manage rides by user ID
public class RideRepository {
    private final Map<String, List<Ride>> userRides = new HashMap<>();

    public void addRide(String userId, Ride ride) {
        userRides.computeIfAbsent(
                userId, key -> new ArrayList<>()
        ).add(ride);
    }

    public List<Ride> getRides(String userId) {
        return new ArrayList<>(
                userRides.getOrDefault(userId, List.of())
        );
    }
}

