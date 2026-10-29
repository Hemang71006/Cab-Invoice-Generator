
package cabInvoiceGenerator;

import java.util.List;

/**
 * Problem Statement:
 * Retrieve rides for a specified user and generate
 * an invoice containing their ride details and fare.
 *
 * Author: Hemang
 * Date: 22-10-2026
 */

// [Hemang]: Generate invoices for users
public class InvoiceService {
    private final RideRepository rideRepository;
    private final CabInvoiceGenerator cabInvoiceGenerator;

    public InvoiceService(
            RideRepository rideRepository,
            CabInvoiceGenerator cabInvoiceGenerator) {
        this.rideRepository = rideRepository;
        this.cabInvoiceGenerator = cabInvoiceGenerator;
    }

    public Invoice getInvoice(String userId) {
        List<Ride> rides = rideRepository.getRides(userId);
        return cabInvoiceGenerator.calculateInvoice(rides);
    }
}
