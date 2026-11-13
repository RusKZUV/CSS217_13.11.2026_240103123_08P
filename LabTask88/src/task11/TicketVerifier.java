package task11;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TicketVerifier {
    // Список валидных бронирований для теста
    private final Set<String> validBookings = new HashSet<>(Arrays.asList("BK123", "BK456", "BK789"));

    public boolean isValid(String bookingRef) {
        return validBookings.contains(bookingRef);
    }
}