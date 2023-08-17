package D24_logicalOperators.D24_T1_LogicalAND;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Number Range Validator");
        System.out.println("A Java program to validate if a given number is within a specific range. ");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int givenInput = scanner.nextInt();

       String outputText = givenInput >= 10 && givenInput <= 50 ? "The given number is within the valid range." : "The given number is not within the valid range.";
        System.out.println(outputText);

    }

}
