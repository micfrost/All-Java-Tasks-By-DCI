package D37_Interfaces.D37_T3_InventoryManagement;

public class Product implements InventoryItem {
    private String productName;
    private double unitPrice;
    private int availableQuantity;

    public Product(String productName, double unitPrice, int availableQuantity) {
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.availableQuantity = availableQuantity;
    }

    @Override
    public void addToInventory(int quantity) {
        this.availableQuantity += quantity;
    }

    @Override
    public void removeFromInventory(int quantity) {
        this.availableQuantity -= quantity;
    }

    @Override
    public int getAvailableQuantity() {
        return this.availableQuantity;
    }

    @Override
    public String toString() {
        return
                "Product: " + productName +
                ", \tPrice: " + unitPrice +
                ", \tAvailable quantity: " + availableQuantity;
    }

    public String getProductName() {
        return productName;
    }
}
