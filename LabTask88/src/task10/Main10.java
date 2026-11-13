package task10;

public class Main10 {
    public static void main(String[] args) {
        HotelReceptionFacade hotel = new HotelReceptionFacade(
                new RoomAvailability(),
                new BillingService(),
                new KeyCardEncoder(),
                new HousekeepingNotifier()
        );

        // Тест 1: Успешное заселение
        int room1 = hotel.checkInGuest("Alice Smith", "DOUBLE", 3);
        System.out.println();

        // Тест 2: Успешное заселение в люкс
        int room2 = hotel.checkInGuest("Bob Jones", "SUITE", 1);
        System.out.println();

        // Тест 3: Ошибка (все люксы заняты)
        int room3 = hotel.checkInGuest("Charlie Brown", "SUITE", 2);
        System.out.println();

        // Тест 4: Выселение и повторная попытка заселения в люкс
        if (room2 != -1) {
            hotel.checkOutGuest(room2);
            System.out.println();
            int room4 = hotel.checkInGuest("Diana Prince", "SUITE", 1);
            System.out.println("New assigned room: " + room4);
        }
    }
}