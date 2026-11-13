package task11;

public class BaggageHandler {
    public static final double MAX_WEIGHT_KG = 23.0;

    public boolean processBaggage(String bookingRef, double weightKg) {
        if (weightKg > MAX_WEIGHT_KG) {
            System.out.println("[BaggageHandler] REJECTED: Bag weight " + weightKg + "kg exceeds limit of " + MAX_WEIGHT_KG + "kg.");
            return false;
        }
        System.out.println("[BaggageHandler] Bag tagged successfully (" + weightKg + "kg) for booking " + bookingRef + ".");
        return true;
    }
}