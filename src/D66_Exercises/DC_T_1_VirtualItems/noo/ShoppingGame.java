package D66_Exercises.DC_T_1_VirtualItems.noo;



import java.util.ArrayList;
import java.util.Scanner;

class VirtualItem {
    private int itemID;
    private String name;
    private double price;
    private int points;

    public VirtualItem(int itemID, String name, double price, int points) {
        this.itemID = itemID;
        this.name = name;
        this.price = price;
        this.points = points;
    }

    public int getItemID() {
        return itemID;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getPoints() {
        return points;
    }

    @Override
    public String toString() {
        return "ID: " + itemID + ", Name: " + name + ", Price: $" + price + ", Points: " + points;
    }
}

class PowerUp extends VirtualItem {
    private String effect;

    public PowerUp(int itemID, String name, double price, int points, String effect) {
        super(itemID, name, price, points);
        this.effect = effect;
    }

    public String getEffect() {
        return effect;
    }
}

class Decoration extends VirtualItem {
    private String theme;

    public Decoration(int itemID, String name, double price, int points, String theme) {
        super(itemID, name, price, points);
        this.theme = theme;
    }

    public String getTheme() {
        return theme;
    }
}

public class ShoppingGame {
    public static void main(String[] args) {
        ArrayList<VirtualItem> cart = new ArrayList<>();
        int playerPoints = 100;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Available Items:");
            System.out.println("1. Power-Up (Double Points) - $10");
            System.out.println("2. Power-Up (Extra Life) - $15");
            System.out.println("3. Decoration (Space Theme) - $5");
            System.out.println("4. Decoration (Fantasy Theme) - $7");
            System.out.println("5. Display Cart");
            System.out.println("6. Quit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    if (playerPoints >= 10) {
                        cart.add(new PowerUp(cart.size() + 1, "Double Points Power-Up", 10, 20, "Double Points"));
                        playerPoints -= 10;
                    } else {
                        System.out.println("Insufficient points!");
                    }
                    break;
                case 2:
                    if (playerPoints >= 15) {
                        cart.add(new PowerUp(cart.size() + 1, "Extra Life Power-Up", 15, 30, "Extra Life"));
                        playerPoints -= 15;
                    } else {
                        System.out.println("Insufficient points!");
                    }
                    break;
                case 3:
                    if (playerPoints >= 5) {
                        cart.add(new Decoration(cart.size() + 1, "Space Theme Decoration", 5, 10, "Space"));
                        playerPoints -= 5;
                    } else {
                        System.out.println("Insufficient points!");
                    }
                    break;
                case 4:
                    if (playerPoints >= 7) {
                        cart.add(new Decoration(cart.size() + 1, "Fantasy Theme Decoration", 7, 15, "Fantasy"));
                        playerPoints -= 7;
                    } else {
                        System.out.println("Insufficient points!");
                    }
                    break;
                case 5:
                    System.out.println("Your Cart:");
                    for (VirtualItem item : cart) {
                        System.out.println(item);
                    }
                    System.out.println("Total Points in Cart: " + calculateTotalPoints(cart));
                    System.out.println("Remaining Points: " + playerPoints);
                    break;
                case 6:
                    System.out.println("Thank you for playing!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static int calculateTotalPoints(ArrayList<VirtualItem> cart) {
        int totalPoints = 0;
        for (VirtualItem item : cart) {
            totalPoints += item.getPoints();
        }
        return totalPoints;
    }
}

