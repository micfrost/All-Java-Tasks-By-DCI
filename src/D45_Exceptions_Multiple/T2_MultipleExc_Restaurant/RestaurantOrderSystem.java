package D45_Exceptions_Multiple.T2_MultipleExc_Restaurant;
import java.util.*;
public class RestaurantOrderSystem {
    Scanner scanner = new Scanner(System.in);
    private ArrayList<MenuItem> menuItemArrayList;
    RestaurantOrderSystem() {
        menuItemArrayList = new ArrayList<>();
        menuItemArrayList.add(new MenuItem("Table", 100));
        menuItemArrayList.add(new MenuItem("Chair", 200));
        menuItemArrayList.add(new MenuItem("Lamp", 300));
        menuItemArrayList.add(new MenuItem("Window", 400));
        menuItemArrayList.add(new MenuItem("Mirror", 500));
    }
    void userInterface() {
        System.out.println("- - - - - ");
        System.out.println("Handling Multiple Exceptions in a Restaurant Order System");
        String chosenOption;
        do {
            System.out.println("- - - - - ");
            System.out.println("Menu:");
            System.out.println("1. View the menu and prices.");
            System.out.println("2. Place an order.");
            System.out.println("3. Display the total bill.");
            System.out.println("4. Pay the bill.");
            System.out.println("5. Exit");
            System.out.println("- - - - - ");
            System.out.print("Enter selected option: ");
            chosenOption = scanner.nextLine();
            switch (chosenOption) {
                case "1" -> viewMenu();
                case "2" -> placeOrder();
                case "3" -> displayBill();
                case "4" -> payTheBill();
                case "5" -> exit();
                default -> tryOneMoreTime();
            }
        } while (!chosenOption.equals("5"));
    }
    private void viewMenu() {
        System.out.println("- - - - - ");
        for (MenuItem element : menuItemArrayList
        ) {
            System.out.println(element);
        }
        System.out.println();
    }
    private void placeOrder() {
        System.out.println("- - - - - ");
        boolean isInMenu = false;
        System.out.println("Select menu items");
        String orderName = scanner.nextLine();
        for (MenuItem element : menuItemArrayList
        ) {
            if (element.getName().equals(orderName)) {
                isInMenu = true;
                break;
            }
        }
        try {
            if (isInMenu) {
                System.out.println("How many of " + orderName + " would you like to order?");
                try {
                    int orderQuantity = Integer.parseInt(scanner.nextLine());
                    for (MenuItem element : menuItemArrayList
                    ) {
                        if (element.getName().equals(orderName)) {
                            element.setQuantity(orderQuantity);
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
        for (MenuItem element : menuItemArrayList) {
            bill = bill + element.getPrice() * element.getQuantity();
        }
        return bill;
    }
    private void displayBill() {
        double bill = calculateBill();
        System.out.println("- - - - - ");
        for (MenuItem element : menuItemArrayList) {
            if (element.getQuantity() != 0) {
                System.out.print(element.getName() + " ");
                System.out.print(element.getPrice() + "€");
                System.out.println(", Ordered: " + element.getQuantity() + " item(s).");
            }
        }
        System.out.println("Total bill: " + bill + "€.");
    }
    private void payTheBill() {
        double bill = calculateBill();
        System.out.println("Enter the amount of money to pay the bill");
        try {
            double mooneyToPayTheBill = Double.parseDouble(scanner.nextLine());
            System.out.println("Given: \t" + mooneyToPayTheBill + "\nBill: \t" + bill + "\nRest: \t" + (mooneyToPayTheBill - bill));

        } catch (NumberFormatException e) {
            System.out.println("- - -\nOh no: Invalid payment input (e.g., non-numeric input when paying the bill).\nTry to pay one more time.");
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
