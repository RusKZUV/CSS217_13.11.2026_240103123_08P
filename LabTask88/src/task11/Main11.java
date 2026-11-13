package task11;

public class Main11 {
    public static void main(String[] args) {
        AirportCheckInFacade airport = new AirportCheckInFacade(
                new TicketVerifier(),
                new SeatAllocator(),
                new BaggageHandler(),
                new BoardingPassGenerator()
        );

        // Тест 1: Успешная регистрация
        System.out.println(">>> TEST 1: Valid Booking, Normal Baggage");
        String pass1 = airport.completeCheckIn("BK123", 18.5);
        System.out.println(pass1);
        System.out.println();

        // Тест 2: Отказ (превышен вес багажа)
        System.out.println(">>> TEST 2: Overweight Baggage");
        String pass2 = airport.completeCheckIn("BK456", 25.0);
        System.out.println(pass2);
        System.out.println();

        // Тест 3: Отказ (неверный номер брони)
        System.out.println(">>> TEST 3: Invalid Booking Reference");
        String pass3 = airport.completeCheckIn("BK999", 10.0);
        System.out.println(pass3);
    }
}