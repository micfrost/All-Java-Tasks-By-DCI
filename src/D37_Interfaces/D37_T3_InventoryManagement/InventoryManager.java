package D37_Interfaces.D37_T3_InventoryManagement;

import java.util.*;

public class InventoryManager {

    List<InventoryItem> inventoryItemList;

    public InventoryManager() {
        System.out.println("Inventory Management System");
        inventoryItemList = new ArrayList<>();
    }

    public void addItem(InventoryItem inventoryItem) {

        inventoryItemList.add(inventoryItem);
    }

    public void removeItem(InventoryItem inventoryItem) {

        inventoryItemList.remove(inventoryItem);
    }

    void displayAll() {
        for (InventoryItem item : inventoryItemList
        ) {
            System.out.println(item);
        }
    }

}
