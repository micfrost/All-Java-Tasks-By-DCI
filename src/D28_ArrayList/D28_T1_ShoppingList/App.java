package D28_ArrayList.D28_T1_ShoppingList;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public void run() {
        ArrayList<String> shoppingList = new ArrayList<>();

        int chosenOption;
        do {
            menu();

            Scanner scanner = new Scanner(System.in);
            chosenOption = Integer.parseInt(scanner.nextLine());

            switch (chosenOption) {
                case 1 -> addItem(scanner, shoppingList);
                case 2 -> removeItem(scanner, shoppingList);
                case 3 -> displayList(scanner, shoppingList);
                case 4 -> exit();
                default -> tryOneMoreTime();
            }
        } while (chosenOption != 4);
    }

    private static void menu() {
        System.out.println("- - - - - ");
        System.out.println("Menu:");
        System.out.println("1. Add an item");
        System.out.println("2. Remove an item");
        System.out.println("3. Display the list");
        System.out.println("4. End");
        System.out.println("- - - - - ");
        System.out.print("Enter selected number: ");
    }

    private static void addItem(Scanner scanner, ArrayList<String> shoppingList) {
        System.out.println("- - - - - ");
        String givenItem;
        do {
            System.out.println("Add an Item to the shopping list. Type \"end\" to end adding.");
            givenItem = scanner.nextLine();
            if (!givenItem.equals("end")) {
                shoppingList.add(givenItem);
            }
            System.out.println(givenItem + " added successfully.");
        } while (!givenItem.equals("end"));

    }

    private static void removeItem(Scanner scanner, ArrayList<String> arrList) {
        if (!arrList.isEmpty()) {
//          List before removing
            displayList(scanner, arrList);

//          Removing
            System.out.println("Which item do you want to remove. Type a number of the item");
            int numOfItem = scanner.nextInt();
            System.out.println("- - - - - ");
            System.out.println("Item " + numOfItem + ": " + arrList.get(numOfItem - 1) + " removed successfully.");
            arrList.remove((numOfItem - 1));

//          List after removing
            displayList(scanner, arrList);
        } else {
            System.out.println("Shopping list is empty. Add something first.");
            addItem(scanner, arrList);
        }
    }

    private static void displayList(Scanner scanner, ArrayList<String> arrList) {
        if (!arrList.isEmpty()) {
        System.out.println("- - - - - ");
        System.out.println("Shopping List: ");
        for (int i = 0; i < arrList.size(); i++) {
            String element = arrList.get(i);
            System.out.println("Item " + (i + 1) + ": " + element + ".");
        }}else {
            System.out.println("Shopping list is empty. Add something first.");
            addItem(scanner, arrList);
        }
    }

    private static void exit() {
        System.out.println("- - - - - ");
        System.out.println("Exit the program");
    }

    private static void tryOneMoreTime() {
        System.out.println("- - - - - ");
        System.out.println("Try one more time.");
    }
}



