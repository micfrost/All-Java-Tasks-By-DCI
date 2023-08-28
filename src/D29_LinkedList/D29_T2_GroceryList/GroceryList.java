package D29_LinkedList.D29_T2_GroceryList;

import java.util.LinkedList;

public class GroceryList {

//    Creating my Instance of a List with groceryItems !!!
    LinkedList<GroceryItem> myGroceryList = new LinkedList<>();


//    Adding products to my created above Instance List using a defined template (constructor) GroceryItem from a separate file
    public void addItem(String givenName, double givenPrice) {
        GroceryItem item = new GroceryItem(givenName, givenPrice);
        myGroceryList.add(item);
    }

    public void displayList() {
        System.out.println("Grocery List:");
        for (GroceryItem item : myGroceryList) {
            System.out.printf("Item: %s, \tPrice: $ %.2f.\n" , item.name, item.price);
        }
    }


}
