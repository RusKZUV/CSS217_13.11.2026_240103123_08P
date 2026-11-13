package task10;

public class BillingService {
    public void chargeGuest(String guestName, double amount) {
        System.out.println("[BillingService] Charged $" + amount + " to " + guestName + " for the stay.");
    }
}