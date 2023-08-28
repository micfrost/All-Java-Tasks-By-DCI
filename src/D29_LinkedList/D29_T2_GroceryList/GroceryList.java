package D29_LinkedList.D29_T2_GroceryList;

import java.util.LinkedList;

public class GroceryList {

    LinkedList<GroceryItem> items;

    public GroceryList() {
        items = new LinkedList<>();
    }

    public void addItem(String givenName, double givenPrice) {
        GroceryItem item = new GroceryItem(givenName, givenPrice);
        items.add(item);

    }

    public void displayList() {
        System.out.println("Grocery List:");
        for (GroceryItem item : items) {
            System.out.printf("Item: %s, \tPrice: $ %.2f.\n" , item.name, item.price);
        }
    }


}
