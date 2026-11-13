package task05;

public class Main5 {
    public static void main(String[] args) {
        OrderFacade facade = new OrderFacade(new InventoryService(), new PaymentProcessor(), new ShippingService());
        facade.placeOrder("ITEM-1", 49.99, "12 Java Street");
        System.out.println();
        facade.placeOrder("ITEM-2", 120.00, "5 Pattern Avenue");
    }
}