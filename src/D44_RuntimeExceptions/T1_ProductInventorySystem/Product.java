package D44_RuntimeExceptions.T1_ProductInventorySystem;

public class Product {
    private int productId;
    private String productName;
    private double productPrice;

    public Product(int productId, String productName, double productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Product Id: " + productId +
                ", Name: " + productName +
                ", Price: " + productPrice;
    }

    public int getProductId() {
        return productId;
    }
}
