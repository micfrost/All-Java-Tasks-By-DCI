package D37_Interfaces.D37_T3_InventoryManagement;

interface InventoryItem {

    void addToInventory(int quantity);
    void removeFromInventory(int quantity);
    int getAvailableQuantity();

}
