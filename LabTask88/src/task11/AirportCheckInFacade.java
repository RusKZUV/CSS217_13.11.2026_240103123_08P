package task11;

public class AirportCheckInFacade {
    private final TicketVerifier ticketVerifier;
    private final SeatAllocator seatAllocator;
    private final BaggageHandler baggageHandler;
    private final BoardingPassGenerator passGenerator;

    public AirportCheckInFacade(TicketVerifier ticketVerifier, SeatAllocator seatAllocator,
                                BaggageHandler baggageHandler, BoardingPassGenerator passGenerator) {
        this.ticketVerifier = ticketVerifier;
        this.seatAllocator = seatAllocator;
        this.baggageHandler = baggageHandler;
        this.passGenerator = passGenerator;
    }

    public String completeCheckIn(String bookingRef, double bagWeightKg) {
        System.out.println("--- Starting Check-In for " + bookingRef + " ---");

        // 1. Проверка валидности билета
        if (!ticketVerifier.isValid(bookingRef)) {
            return "CHECK-IN FAILED: Invalid booking reference.";
        }

        // 2. Проверка и регистрация багажа
        if (!baggageHandler.processBaggage(bookingRef, bagWeightKg)) {
            return "CHECK-IN FAILED: Baggage overweight. Please visit the counter.";
        }

        // 3. Выделение места
        String assignedSeat = seatAllocator.allocateSeat();
        System.out.println("[AirportCheckInFacade] Seat assigned: " + assignedSeat);

        // 4. Генерация посадочного талона
        return passGenerator.generatePass(bookingRef, assignedSeat);
    }
}