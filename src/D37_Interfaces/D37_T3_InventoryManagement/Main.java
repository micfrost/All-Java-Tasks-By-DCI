package D37_Interfaces.D37_T3_InventoryManagement;

public class Main {
    public static void main(String[] args) {

        InventoryManager inventoryManager = new InventoryManager();

        InventoryItem iphone = new Product("Iphone15", 799.0, 20);
        InventoryItem samsungGalaxy = new Product("SamsungX", 599.0, 50);
        InventoryItem nokia = new Product("Nokia", 299.0, 50);

        InventoryItem lorry = new Equipment("Lorry", 1099.0, 2);

        System.out.println("- - -");
        System.out.println("ADDING ITEMS");
        inventoryManager.addItem(iphone);
        inventoryManager.addItem(samsungGalaxy);
        inventoryManager.addItem(nokia);
        inventoryManager.addItem(lorry);
        inventoryManager.displayAll();

        System.out.println("- - -");
        System.out.println("AFTER REMOVING");
        inventoryManager.removeItem(samsungGalaxy);
        inventoryManager.displayAll();


        System.out.println("- - -");
        System.out.println("AFTER ADDING AND REMOVING QUANTITY");
        iphone.removeFromInventory(7);
        lorry.addToInventory(100);
        inventoryManager.displayAll();
    }

}
