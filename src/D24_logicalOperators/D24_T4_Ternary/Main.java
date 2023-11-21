package D24_logicalOperators.D24_T4_Ternary;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Discount C1 with Ternary Operator");
        System.out.println("DC_T_1_ReantrantLock_Inside Java program to calculate the total cost of an order after applying a discount based on the order amount.");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the order amount: ");
        double givenOrderAmount = scanner.nextDouble();

        double totalCost = givenOrderAmount > 100 ?
                givenOrderAmount - givenOrderAmount * 0.1 :
                givenOrderAmount;

        System.out.println("Total cost: " + totalCost + " $");

    }

}
