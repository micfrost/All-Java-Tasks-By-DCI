package D73_SwitchExpressions.T_1_CoffeShop.micfro2;

import java.util.Scanner;

public class CoffeeOrderProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Coffee Shop!");
        System.out.println("Please enter your coffee choice (espresso, latte, cappuccino):");
        String choiceCoffee = scanner.nextLine().toLowerCase(); // Convert input to lowercase for case-insensitivity

        System.out.println("Please enter the size (small, medium, large):");
        String choiceSize = scanner.nextLine().toLowerCase(); // Convert input to lowercase for case-insensitivity

        double cost = processOrder(choiceCoffee, choiceSize);

        if (cost != -1) {
            System.out.println("Your order:");
            System.out.println("Coffee: " + choiceCoffee);
            System.out.println("Size: " + choiceSize);
            System.out.println("Cost: " + cost + "€");
            System.out.println("Thank you for your order!");
        } else {
            System.out.println("Invalid order! Please select from available options.");
        }
    }

    public static double processOrder(String choiceCoffee, String choiceSize) {
        return switch (choiceCoffee) {
            case "espresso" -> switch (choiceSize) {
                case "small" -> 1.25;
                case "medium" -> 1.75;
                case "large" -> 2.00;
                default -> -1;
            };
            case "latte" -> switch (choiceSize) {
                case "small" -> 1.50;
                case "medium" -> 2.00;
                case "large" -> 2.50;
                default -> -1;
            };
            case "cappuccino" -> switch (choiceSize) {
                case "small" -> 1.75;
                case "medium" -> 2.25;
                case "large" -> 2.75;
                default -> -1;
            };
            default -> -1;
        };
    }
}