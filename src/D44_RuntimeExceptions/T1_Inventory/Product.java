package D44_RuntimeExceptions.T1_Inventory;

class Product {

    // Variables
    private int productID;
    private String productName;
    private double productPrice;

    // Constructor
    Product(int productID, String productName, double productPrice) {
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public int getProductID() {
        return productID;
    }

    // ToString
    @Override
    public String toString() {
        return "Product: \nID:\t" + productID + "\nName:\t" + productName + "\nPrice:\t" + productPrice;



    }
}
