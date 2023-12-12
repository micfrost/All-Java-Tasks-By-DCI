package D74_WEEKLYQUICKLY.src.main;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Product productCola = new Product();

        Item itemCola2022 = new Item(productCola, 2022, 20, true);
        Item itemCola2023 = new Item(productCola, 2023, 15, true);

        ArrayList<Item> itemsList = new ArrayList<>();
        itemsList.add(itemCola2022);
        itemsList.add(itemCola2023);

        for (Item item : itemsList) {
            if (item.product.productID == productCola.productID) {
                productCola.productQuantity = productCola.productQuantity + item.itemQuantity;
            }
        }

        System.out.println(productCola.productQuantity);
    }
}
