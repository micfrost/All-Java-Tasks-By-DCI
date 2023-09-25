package D44_RuntimeExceptions.T1_Inventory;


import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        Scanner scanner = new Scanner(System.in);
        int id;
        String name;
        double price;
        int choice;

        do {

            displayMenu();
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("Please enter the product ID: ");
                    id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Please enter the product name: ");
                    name = scanner.nextLine();

                    System.out.println("Please enter the product price: ");
                    price = scanner.nextDouble();
                    scanner.nextLine();

                    Product product = new Product(id, name, price);

                    inventory.addProduct(product);

                    System.out.println();
                    break;

                case 2:
                    System.out.println("Enter the product ID of the product you like to search: ");
                    id = scanner.nextInt();
                    scanner.nextLine();

                    String details = inventory.getProductDetails(id);
                    System.out.println(details);

                    System.out.println();
                    break;

                case 3:
                    System.out.println("You have exited the program.");
                    System.out.println();
                    break;

                default:
                    System.out.println("Invalid choice");
                    System.out.println();

            }

        } while (choice != 3);

        scanner.close();

    }

    public static void displayMenu() {
        System.out.println("To add an item to the inventory system, enter 1.");
        System.out.println("To display the contents of the inventory system, enter 2.");
        System.out.println("To exit the program, enter 3.");
        System.out.println();
    }

    /*
     * public static void scannerInput(Scanner scanner, int id, String name, double
     * price) { System.out.println("Please enter the product ID: "); id =
     * scanner.nextInt(); scanner.nextLine();
     *
     * System.out.println("Please enter the product name: "); name =
     * scanner.nextLine(); scanner.nextLine();
     *
     * System.out.println("Please enter the product price: "); price =
     * scanner.nextDouble(); scanner.nextLine();
     *
     * Product product = new Product(id, name, price); }
     */

}