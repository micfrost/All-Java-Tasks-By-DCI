package D29_LinkedList.D29_T2_GroceryList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of an Item: ");
        String givenName1 = scanner.nextLine();
        System.out.println("Enter the price of an Item: ");
        double givenPrice1 = Double.parseDouble(scanner.nextLine());
        System.out.println("- - - - -");

        GroceryList groceryList1 = new GroceryList();
        groceryList1.addItem("Banana", 1.00);
        groceryList1.addItem("Water", 0.50);
        groceryList1.addItem("Orange", 2.00);
        groceryList1.addItem(givenName1, givenPrice1);

        groceryList1.displayList();
    }


}

