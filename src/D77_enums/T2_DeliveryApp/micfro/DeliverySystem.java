package D77_enums.T2_DeliveryApp.micfro;

import java.util.ArrayList;
import java.util.Scanner;

public class DeliverySystem {
    Scanner scanner = new Scanner(System.in);
    private ArrayList<Customer> customerList;
    private ArrayList<Delivery> deliveryList;

    public DeliverySystem() {
        customerList = new ArrayList<>();
        Customer customerTest = new Customer("John", "Paris");
        customerTest.setCustomerID(customerList.size() + 1001);
        customerList.add(customerTest);
        deliveryList = new ArrayList<>();
        Delivery deliveryTest = new Delivery("TV", 10, customerTest);
        deliveryTest.setDeliveryID(deliveryList.size() + 2001);
        deliveryTest.setDeliveryStatus(DeliveryStatus.IN_DELIVERY);
        deliveryList.add(deliveryTest);
    }

    public void deliveryUI() {
        String chosenOption;
        do {
            System.out.println("- - - - - ");
            System.out.println("Delivery System.");
            System.out.println("1. Add a new customer.");
            System.out.println("2. Display a list of customers");
            System.out.println("3. Add a delivery");
            System.out.println("4. Display a List of deliveries");
            System.out.println("5. Mark a delivery as delivered.");
            System.out.println("6. Exit");
            System.out.println("- - - - - ");
            System.out.print("Enter selected option: ");
            chosenOption = scanner.nextLine();
            switch (chosenOption) {
                case "1" -> addCustomer();
                case "2" -> displayCustomers();
                case "3" -> addDelivery();
                case "4" -> displayDeliveries();
                case "5" -> markDeliveryDelivered();
                case "6" -> exit();
                default -> tryOneMoreTime();
            }
        } while (!chosenOption.equals("6"));
    }

    private void addCustomer() {
        System.out.println("Enter a Customer name: ");
        String customerName = scanner.nextLine();
        System.out.println("Enter a Customer address: ");
        String address = scanner.nextLine();
        Customer customer = new Customer(customerName, address);
        customer.setCustomerID(customerList.size() + 1001);
        customerList.add(customer);
    }

    private void displayCustomers() {
        customerList.forEach(element -> System.out.println(element));
    }

    private void addDelivery() {
        System.out.println("Enter an item name: ");
        String itemName = scanner.nextLine();
        System.out.println("Enter an item weight: ");
        double itemWeight = Double.parseDouble(scanner.nextLine());
        if (itemWeight < 0) {
            System.out.println("Item weight cannot be negative.");
            tryOneMoreTime();
        } else {
            System.out.println("Enter a CustomerID: ");
            int customerID = Integer.parseInt(scanner.nextLine());
            for (Customer customer : customerList) {
                if (customer.getCustomerID() == customerID) {
                    Delivery delivery = new Delivery(itemName, itemWeight, customer);
                    delivery.setDeliveryID(deliveryList.size() + 2001);
                    delivery.setDeliveryStatus(DeliveryStatus.IN_DELIVERY);
                    deliveryList.add(delivery);
                }
            }
        }

    }

    private void displayDeliveries() {
        deliveryList.forEach(element -> System.out.println(element));
    }

    private void markDeliveryDelivered() {
        System.out.println("Enter a Delivery ID: ");
        int deliveryID = Integer.parseInt(scanner.nextLine());
        for (Delivery delivery : deliveryList) {
            if (delivery.getDeliveryID() == deliveryID) {
                if (delivery.getDeliveryStatus()==DeliveryStatus.IN_DELIVERY){
                delivery.setDeliveryStatus(DeliveryStatus.DELIVERED);
                System.out.println("Delivery has been marked as delivered successfully.");}
                else {
                    System.out.println("Delivery already marked as delivered.");
                }
            }
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
