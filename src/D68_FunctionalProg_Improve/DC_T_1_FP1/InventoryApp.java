package D68_FunctionalProg_Improve.DC_T_1_FP1;

import java.util.Scanner;

public class InventoryApp {

    Scanner scanner = new Scanner(System.in);

    private Inventory inventory;

    InventoryApp() {
        inventory = new Inventory();
        inventory.addProduct(new Product("Laptop", 1000.0, 5));
        inventory.addProduct(new Product("Smartphone", 500.0, 10));
        inventory.addProduct(new Product("Tablet", 300.0, 8));
    }

    void userInterface() {
        String choice;
        do {
            displayUIMenu();
            choice = scanner.nextLine();
            switch (choice) {
                case "1" -> inventory.displayProducts();
                case "2" -> updatePrices();
                case "3" -> findProductsByPriceRange();
                case "4" -> averagePriceOfProducts();
                case "5" -> sortingProductsBasedOnPrices();
                case "6" -> removingProductsWithLowQuantities();
                case "7" -> exit();
                default -> tryOneMoreTime();
            }
        } while (!choice.equals("7"));
    }

    private void displayUIMenu() {
        System.out.println("- - - - - ");
        System.out.println("1. Display Products");
        System.out.println("2. Update Prices");
        System.out.println("3. Find Products by Price Range");
        System.out.println("4. The average price of products");
        System.out.println("5. Sorting products based on prices");
        System.out.println("6. Removing products with low quantities");
        System.out.println("7. Exit");
        System.out.print("Enter your choice: ");
    }

    private void updatePrices() {
        System.out.println("- - - - - ");
        System.out.print("Enter the percentage increase: ");
        System.out.println("- - - - - ");
        double percentageIncrease = Double.parseDouble(scanner.nextLine());
        inventory.updatePrices(percentageIncrease);
        System.out.println("Prices updated.");
    }

    private void findProductsByPriceRange() {
        System.out.println("- - - - - ");
        System.out.print("Enter the minimum price: ");
        double minPrice = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter the maximum price: ");
        double maxPrice = Double.parseDouble(scanner.nextLine());
        System.out.println("- - - - - ");
        var productsInRange = inventory.findProductsByPriceRange(minPrice, maxPrice);
        System.out.println("Products in the specified price range:");
        productsInRange.forEach(System.out::println);
    }

    private void averagePriceOfProducts() {
        System.out.println("- - - - - ");
        double averagePrice = inventory.calculateAveragePrice();
        System.out.printf("Average price of products: %.2f€\n", averagePrice);
    }
    private void sortingProductsBasedOnPrices() {
        System.out.println("- - - - - ");
        System.out.println("Sorting products based on prices:");
        inventory.sortProductsByPrice().forEach(System.out::println);
    }

    private void removingProductsWithLowQuantities() {
        System.out.println("- - - - - ");
        System.out.print("Enter the minimum Quantity: ");
        int minimumQuantity = Integer.valueOf(scanner.nextLine());
        System.out.println("- - - - - ");
        System.out.println("Removing products with low quantities:");
        inventory.removeProductsWithLowQuantities(minimumQuantity).forEach(System.out::println);
    }


    private void tryOneMoreTime() {
        System.out.println("- - - - - ");
        System.out.println("Invalid choice. Please enter a valid option.");
    }

    private void exit() {
        System.out.println("- - - - - ");
        System.out.println("Exiting the inventory management system. Goodbye!");
        scanner.close();
    }
}


