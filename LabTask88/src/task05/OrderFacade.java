package task05;

public class OrderFacade {
    private final InventoryService inventory;
    private final PaymentProcessor payment;
    private final ShippingService shipping;

    public OrderFacade(InventoryService inventory, PaymentProcessor payment, ShippingService shipping) {
        this.inventory = inventory; this.payment = payment; this.shipping = shipping;
    }

    public void placeOrder(String itemId, double amount, String address) {
        System.out.println("=== Placing Order ===");
        if (!inventory.reserveStock(itemId)) { System.out.println("Order rejected: out of stock."); return; }
        if (!payment.charge(amount)) { System.out.println("Order rejected: payment failed."); return; }
        String label = shipping.generateLabel(address);
        System.out.println("Order confirmed. Shipping label: " + label);
    }
}