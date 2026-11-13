package task05;

public class PaymentProcessor {
    public boolean charge(double amount) {
        System.out.println("[PaymentProcessor] Charged $" + amount + ".");
        return amount > 0;
    }
}

