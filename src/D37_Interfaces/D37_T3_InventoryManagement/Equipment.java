package D37_Interfaces.D37_T3_InventoryManagement;

public class Equipment implements InventoryItem  {

    private String equipmentName;
    private double purchasePrice;
    private int availableQuantity;

    public Equipment(String equipmentName, double purchasePrice, int availableQuantity) {
        this.equipmentName = equipmentName;
        this.purchasePrice = purchasePrice;
        this.availableQuantity = availableQuantity;
    }


    @Override
    public void addToInventory(int quantity) {
        this.availableQuantity+=quantity;
    }

    @Override
    public void removeFromInventory(int quantity) {
        this.availableQuantity -=quantity;
    }

    @Override
    public int getAvailableQuantity() {
        return this.availableQuantity;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public String toString() {
        return "Equipment: " + equipmentName +
                ", \tPrice: " + purchasePrice +
                ", \tAvailable quantity: " + availableQuantity;
    }
}
