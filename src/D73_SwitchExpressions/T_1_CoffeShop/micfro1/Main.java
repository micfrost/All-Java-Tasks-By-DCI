package D73_SwitchExpressions.T_1_CoffeShop.micfro1;

import java.util.Scanner;

public class Main {

    public static void order(String choiceCoffee, String choiceSize) {

        String coffeAndsize = choiceCoffee + choiceSize;
        double s1 = 100.25;
        double s2 = 1.50;

        double l1 = 2.25;
        double l2 = 2.50;

        switch (coffeAndsize) {
            case "1s" -> {
                System.out.println("espresso small");
                System.out.println("Cost: " + s1 + "€.");
                System.out.println("Thank you.");
            }

            case "2s" -> {
                System.out.println("latte small");
                System.out.println("Cost: " + s2 + "€.");
                System.out.println("Thank you.");
            }

            case "1l" -> {
                System.out.println("espresso large");
                System.out.println("Cost: " + l1 + "€.");
                System.out.println("Thank you.");
            }

            case "2l" -> {
                System.out.println("latte large");
                System.out.println("Cost: " + l2 + "€.");
                System.out.println("Thank you.");
            }

            default -> throw new IllegalStateException("Unexpected value: " + coffeAndsize);
        }

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What kind of coffee would you like to have?");
        System.out.println("Please enter: \n1 - espresso \n2 - latte");
        String choiceCoffee = scanner.nextLine();

        System.out.println("The size of your coffee, ");
        System.out.println("Enter: \ns - small \nl - large).");
        String choiceSize = scanner.nextLine();

        try {
            order(choiceCoffee, choiceSize);
        } catch (Exception e) {
            System.out.println("Invalid input or unexpected error occurred.");

        }
    }
}