package D32_HashMap.D32_T4_ShoppingCart;
import java.util.*;
public class ShoppingCart {
    Scanner scanner = new Scanner(System.in);
    HashMap<String, Double> itemsAndPrices = new HashMap<>();
    HashMap<String, Integer> itemsAndQuantities = new HashMap<>();
    public void userInterface() {
        System.out.println("- - -");
        System.out.println("Shopping Cart");
        System.out.println("A program that simulates a basic shopping cart using a HashMap. The program allows users to add items to the cart along with their quantities, display the cart's contents, calculate the total price, and exit the program.");
        String chosenOption;
        do {
            menu();
            chosenOption = scanner.nextLine();
            switch (chosenOption) {
                case "0" -> addItemToShop();
                case "1" -> displayShop();
                case "2" -> addItemToCart();
                case "3" -> displayCart();
                case "4" -> calculateTotalPrice();
                case "5" -> exit();
                default -> tryOneMoreTime();
            }
        } while (!chosenOption.equals("5"));
    }
    private void menu() {
        System.out.println("- - -");
        System.out.println("Menu:");
        System.out.println("0. Add Item to the shop. Only to use by a shop owner.");
        System.out.println("1. Display all items in a shop.");
        System.out.println("2. Add an item to a cart.");
        System.out.println("3. Display a cart content.");
        System.out.println("4. Calculate a total price.");
        System.out.println("5. Exit");
        System.out.println("- - - - - ");
        System.out.print("Enter selected option: ");
    }
    private void addItemToShop() {
        System.out.println("- - -");
        System.out.println("Enter an item and a price to the shop - separated by a space: ");
        String inputString = scanner.nextLine();
        String[] inputArray = inputString.split(" ");
        String k = inputArray[0];
        Double v = Double.valueOf(inputArray[1]);
        itemsAndPrices.put(k, v);
        System.out.println("Item added successfully.");
    }
    private void displayShop() {
        System.out.println("- - -");
        System.out.println("All items in a shop: ");
        for (Map.Entry<String, Double> m : itemsAndPrices.entrySet()) {
            System.out.println("Item: " + m.getKey() + ", Price:  " + m.getValue());
        }
    }
    private void addItemToCart() {
        System.out.println("- - -");
        System.out.println("Enter an item and a quantity to add it to a cart - separated by a space: ");
        String inputString = scanner.nextLine();
        String[] inputArray = inputString.split(" ");
        String k = inputArray[0];
        Integer v = Integer.valueOf(inputArray[1]);
        if (itemsAndPrices.containsKey(k)) {
            itemsAndQuantities.put(k, v);
            System.out.println("Item added successfully.");
        } else {
            System.out.println("Item not found in a shop.");
        }
    }
    private void displayCart() {
        if (!itemsAndQuantities.isEmpty()) {
            System.out.println("- - -");
            System.out.println("All items in a cart: ");
            for (Map.Entry<String, Integer> m : itemsAndQuantities.entrySet()) {
                System.out.println("Name: " + m.getKey() + ", quantity:  " + m.getValue());
            }
        } else {
            System.out.println("Add item to a cart first.");
        }
    }


    private void calculateTotalPrice() {
        if (!itemsAndQuantities.isEmpty()) {
            System.out.println("- - -");

            double totalPrice = 0;
            for (Map.Entry<String, Integer> m : itemsAndQuantities.entrySet()) {
                totalPrice = totalPrice + m.getValue() * itemsAndPrices.get(m.getKey());
            }
            System.out.printf("Total price: %.2f\n", totalPrice);

        } else {
            System.out.println("Add item to a cart first.");
        }
    }


    private void exit() {
        System.out.println("- - - - - ");
        System.out.println("The program was closed successfully.");
    }

    private void tryOneMoreTime() {
        System.out.println("- - - - - ");
        System.out.println("Try one more time.");
    }
}
