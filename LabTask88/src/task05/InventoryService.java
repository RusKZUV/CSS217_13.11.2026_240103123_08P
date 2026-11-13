package task05;

import java.util.*;

public class InventoryService {
    private final Set<String> stock = new HashSet<>(Arrays.asList("ITEM-1", "ITEM-2", "ITEM-3"));

    public boolean reserveStock(String itemId) {
        boolean ok = stock.remove(itemId);
        System.out.println("[InventoryService] Reserve " + itemId + ": " + (ok ? "OK" : "FAILED"));
        return ok;
    }
}