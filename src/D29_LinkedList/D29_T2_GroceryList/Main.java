package D29_LinkedList.D29_T2_GroceryList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of an Item: ");
        String givenName1 = scanner.nextLine();
        System.out.println("Enter the price of an Item: ");
        Double givenPrice1 = Double.parseDouble(scanner.nextLine());


        GroceryList groceryList = new GroceryList();
        groceryList.addItem("Banana", 1.00);
        groceryList.addItem("Water", 0.50);
        groceryList.addItem("Orange", 2.00);
        groceryList.addItem(givenName1, givenPrice1);

        groceryList.displayList();
    }


}

