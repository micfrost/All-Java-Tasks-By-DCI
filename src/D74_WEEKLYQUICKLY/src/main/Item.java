package D74_WEEKLYQUICKLY.src.main;

public class Item {
    Product product;
    int itemID;
    int itemQuantity;
    boolean isValid;

    public Item(Product product, int itemID, int itemQuantity, boolean isValid) {
        this.product = product;
        this.itemID = itemID;
        this.itemQuantity = itemQuantity;
        this.isValid = isValid;
    }
}
