package D24_logicalOperators.D24_T1_LogicalAND;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Number Range Validator");
        System.out.println("DC_T_1_ReantrantLock_Inside Java program to validate if a given number is within a specific range. ");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int givenInput = scanner.nextInt();

        System.out.println("--- USING TERNARY ---");
        String outputText = givenInput >= 10 && givenInput <= 50 ?
                "The given number is within the valid range." :
                "The given number is not within the valid range.";
        System.out.println(outputText);


        System.out.println("--- USING BOOLEAN ---");
        boolean isWithinRange = givenInput >= 10 && givenInput <= 50;

        if (isWithinRange) {
            System.out.println("The given number is within the valid range.");
        } else {
            System.out.println("The given number is not within the valid range.");
        }
        scanner.close();

    }

}
