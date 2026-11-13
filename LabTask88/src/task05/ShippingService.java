package task05;

public class ShippingService {
    public String generateLabel(String address) {
        System.out.println("[ShippingService] Label generated for: " + address);
        return "LBL-" + Math.abs(address.hashCode());
    }
}