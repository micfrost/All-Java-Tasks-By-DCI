package D74_WEEKLYQUICKLY.src.main;

import java.util.ArrayList;
import java.util.Scanner;

public class ShopOrderSystem {

    Scanner scanner = new Scanner(System.in);
    private ArrayList<Product> productsList;

    public ShopOrderSystem() {
        productsList = new ArrayList<>();
        productsList.add(new Product("Coffee", 103.5));
        productsList.add(new Product("Tee", 0.5));
        productsList.add(new Product("Fanta", 0.5));
        productsList.add(new Product("Water", 0.50));
        productsList.add(new Product("Sugar", 0.50));
    }

    void orderUI() {
        System.out.println("- - - - - ");
        System.out.println("Shop Order System");
        String chosenOption;
        do {
            System.out.println("- - - - - ");
            System.out.println("Menu:");
            System.out.println("1. View the products.");
            System.out.println("2. Add to a cart.");
            System.out.println("3. Display the cart.");
            System.out.println("4. Pay the bill.");
            System.out.println("5. Exit");
            System.out.println("- - - - - ");
            System.out.print("Enter selected option: ");
            chosenOption = scanner.nextLine();
            switch (chosenOption) {
                case "1" -> viewProducts();
                case "2" -> addToCart();
                case "3" -> displayCart();
                case "4" -> payTheBill();
                case "5" -> exit();
                default -> tryOneMoreTime();
            }
        } while (!chosenOption.equals("5"));
    }

    private void viewProducts() {
        System.out.println("- - - - - ");
        for (Product product : productsList
        ) {
            System.out.println(product);
        }
        System.out.println();
    }

    private void addToCart() {
        System.out.println("- - - - - ");
        boolean isInMenu = false;
        System.out.println("Enter a name of a product you want to add to a card.");
        String orderName = scanner.nextLine();
        for (Product product : productsList
        ) {
            if (product.getName().equals(orderName)) {
                isInMenu = true;
                break;
            }
        }
        try {
            if (isInMenu) {
                System.out.println("How many of " + orderName + " would you like to order?");
                try {
                    int orderQuantity = Integer.parseInt(scanner.nextLine());
                    for (Product product : productsList
                    ) {
                        if (product.getName().equals(orderName)) {
                            product.setQuantity(orderQuantity);
                        }
                    }
                } catch (NumberFormatException e) {
                    System.out.println("- - -\nOh no: Invalid quantity input (e.g., non-integer input).\nPlace an order again.");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } else {
                throw new Exception("- - -\nOh no: Invalid menu item selection.\nPlace an order with a proper name.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private double calculateBill() {
        System.out.println();
        double bill = 0;
        for (Product product : productsList) {
            bill = bill + product.getPrice() * product.getQuantity();
        }
        return bill;
    }

    private void displayCart() {
        double bill = calculateBill();
        System.out.println("- - - - - ");
        for (Product product : productsList) {
            if (product.getQuantity() != 0) {
                System.out.print(product.getName() + " ");
                System.out.print(product.getPrice() + "€");
                System.out.println(", Ordered: " + product.getQuantity() + " item(s).");
            }
        }
        System.out.println("Total bill: " + bill + "€.");
    }

    public void payTheBill() {
        double bill = calculateBill();
        System.out.println("Enter the amount of money to pay the bill");
        try {
            double mooneyToPayTheBill = Double.parseDouble(scanner.nextLine());
            System.out.println("Given: \t" + mooneyToPayTheBill + "€" + "\nBill: \t" + bill + "€"+ "\n- - - - -" + "\nRest: \t" + (mooneyToPayTheBill - bill)+ "€");

        } catch (NumberFormatException e) {
            System.out.println("- - -\nOh no: Invalid payment input (e.g., non-numeric input when paying the bill).\nTry to pay one more time.");
        }
    }

    private void exit() {
        System.out.println("- - - - - ");
        System.out.println("The program was closed successfully. Nice.");
    }

    private void tryOneMoreTime() {
        System.out.println("- - - - - ");
        System.out.println("Try one more time please.");
    }

}





