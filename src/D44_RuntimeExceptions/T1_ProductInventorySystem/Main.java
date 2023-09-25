package D44_RuntimeExceptions.T1_ProductInventorySystem;

public class Main {
    public static void main(String[] args) {
        Inventory inventoryMy = new Inventory();

        Product product1 = new Product(101, "Apple", 500);
        Product product2 = new Product(202, "Samsung", 300);
        inventoryMy.addProduct(product1);
        inventoryMy.addProduct(product2);

//        Using Default Throw from a default Exception Message
        System.out.println("- - - ");
        System.out.println("Using Default Throw from a default Exception Message");
        System.out.println(inventoryMy.getProductDetailsDefaultThrow(101));
        System.out.println(inventoryMy.getProductDetailsDefaultThrow(303));

        //        Using Custom Throw from a new Exception Message
        System.out.println("- - - ");
        System.out.println("Using Custom Throw from a new Exception Message");
        System.out.println(inventoryMy.getProductDetailsCustomThrow(202));
        System.out.println(inventoryMy.getProductDetailsCustomThrow(404));



    }
}
