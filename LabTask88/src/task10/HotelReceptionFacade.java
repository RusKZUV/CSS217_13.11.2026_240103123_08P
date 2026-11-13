package task10;

public class HotelReceptionFacade {
    private final RoomAvailability roomAvailability;
    private final BillingService billingService;
    private final KeyCardEncoder keyCardEncoder;
    private final HousekeepingNotifier housekeepingNotifier;

    public HotelReceptionFacade(RoomAvailability roomAvailability, BillingService billingService,
                                KeyCardEncoder keyCardEncoder, HousekeepingNotifier housekeepingNotifier) {
        this.roomAvailability = roomAvailability;
        this.billingService = billingService;
        this.keyCardEncoder = keyCardEncoder;
        this.housekeepingNotifier = housekeepingNotifier;
    }

    public int checkInGuest(String guestName, String roomType, int nights) {
        System.out.println("=== Check-In: " + guestName + " ===");

        // 1. Выделяем номер (если нет, вернется -1)
        int assignedRoom = roomAvailability.assignRoom(roomType);

        if (assignedRoom == -1) {
            System.out.println("Check-in failed: No " + roomType + " rooms available.");
            return -1;
        }

        // 2. Считаем и списываем оплату
        double rate = roomAvailability.getNightlyRate(roomType);
        double totalCost = rate * nights;
        billingService.chargeGuest(guestName, totalCost);

        // 3. Кодируем ключ
        keyCardEncoder.encodeCard(assignedRoom);

        System.out.println("Check-in successful! Assigned Room: " + assignedRoom);
        return assignedRoom;
    }

    public void checkOutGuest(int roomNumber) {
        System.out.println("=== Check-Out: Room " + roomNumber + " ===");

        // 1. Освобождаем номер
        roomAvailability.releaseRoom(roomNumber);

        // 2. Оповещаем горничных
        housekeepingNotifier.alertHousekeeping(roomNumber);
    }
}