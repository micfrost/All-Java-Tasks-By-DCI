package D44_RuntimeExceptions.T1_ProductInventorySystem;

public class Main {
    public static void main(String[] args) {
        Inventory inventoryMy = new Inventory();

        Product product1 = new Product(101, "Apple", 500);
        Product product2 = new Product(202, "Samsung", 300);
        inventoryMy.addProduct(product1);
        inventoryMy.addProduct(product2);

        System.out.println(inventoryMy.getProductDetails(101));
        System.out.println(inventoryMy.getProductDetails(202));
        System.out.println(inventoryMy.getProductDetails(303));
    }
}
