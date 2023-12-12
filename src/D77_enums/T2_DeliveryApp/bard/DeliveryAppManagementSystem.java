package D77_enums.T2_DeliveryApp.bard;

import java.util.ArrayList;
import java.util.Scanner;

class Customer {
    private static int nextCustomerId = 1;
    private int customerId;
    private String name;
    private String address;

    public Customer(String name, String address) {
        this.customerId = nextCustomerId++;
        this.name = name;
        this.address = address;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}

class Delivery {
    private Customer customer;
    private String itemName;
    private double itemWeight;
    private boolean isDelivered;

    public Delivery(Customer customer, String itemName, double itemWeight) {
        this.customer = customer;
        this.itemName = itemName;
        this.itemWeight = itemWeight;
        this.isDelivered = false;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getItemName() {
        return itemName;
    }

    public double getItemWeight() {
        return itemWeight;
    }

    public boolean isDelivered() {
        return isDelivered;
    }

    public void markAsDelivered() {
        isDelivered = true;
    }
}

class DeliveryService {
    private ArrayList<Customer> customers = new ArrayList<>();
    private ArrayList<Delivery> deliveries = new ArrayList<>();

    public void registerCustomer(String name, String address) {
        Customer customer = new Customer(name, address);
        customers.add(customer);
        System.out.println("Customer registered successfully. Customer ID: " + customer.getCustomerId());
    }

    public void displayCustomers() {
        System.out.println("\nCustomers:");
        for (Customer customer : customers) {
            System.out.println("ID: " + customer.getCustomerId() + ", Name: " + customer.getName() +
                    ", Address: " + customer.getAddress());
        }
    }

    public void placeDelivery(int customerId, String itemName, double itemWeight) {
        Customer customer = findCustomer(customerId);

        if (customer != null) {
            Delivery delivery = new Delivery(customer, itemName, itemWeight);
            deliveries.add(delivery);
            System.out.println("Delivery placed successfully.");
        } else {
            System.out.println("Customer not found. Please check the ID.");
        }
    }

    public void displayDeliveries() {
        System.out.println("\nDeliveries:");
        for (Delivery delivery : deliveries) {
            System.out.println("Item: " + delivery.getItemName() +
                    ", Weight: " + delivery.getItemWeight() +
                    ", Customer: " + delivery.getCustomer().getName() +
                    ", Delivered: " + (delivery.isDelivered() ? "Yes" : "No"));
        }
    }

    public void markDeliveryAsDelivered(int deliveryIndex) {
        if (deliveryIndex >= 0 && deliveryIndex < deliveries.size()) {
            deliveries.get(deliveryIndex).markAsDelivered();
            System.out.println("Delivery marked as delivered.");
        } else {
            System.out.println("Invalid delivery index. Please try again.");
        }
    }

    private Customer findCustomer(int customerId) {
        for (Customer customer : customers) {
            if (customer.getCustomerId() == customerId) {
                return customer;
            }
        }
        return null;
    }
}

public class DeliveryAppManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DeliveryService deliveryService = new DeliveryService();

        while (true) {
            System.out.println("\nDelivery App Management System Menu:");
            System.out.println("1. Register Customer");
            System.out.println("2. Display Customers");
            System.out.println("3. Place Delivery");
            System.out.println("4. Display Deliveries");
            System.out.println("5. Mark Delivery as Delivered");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter customer name: ");
                    String customerName = scanner.nextLine();
                    System.out.print("Enter customer address: ");
                    String customerAddress = scanner.nextLine();

                    deliveryService.registerCustomer(customerName, customerAddress);
                    break;

                case 2:
                    deliveryService.displayCustomers();
                    break;

                case 3:
                    System.out.print("Enter customer ID: ");
                    int customerId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter item name: ");
                    String itemName = scanner.nextLine();
                    System.out.print("Enter item weight: ");
                    double itemWeight = scanner.nextDouble();

                    deliveryService.placeDelivery(customerId, itemName, itemWeight);
                    break;

                case 4:
                    deliveryService.displayDeliveries();
                    break;

                case 5:
                    System.out.print("Enter the index of the delivery to mark as delivered: ");
                    int deliveryIndex = scanner.nextInt();
                    deliveryService.markDeliveryAsDelivered(deliveryIndex);
                    break;

                case 0:
                    System.out.println("Exiting Delivery App Management System. Goodbye!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
