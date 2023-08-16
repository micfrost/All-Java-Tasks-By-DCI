package D23_For_Loops.D23_T3_For_Multiplication;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {

            Scanner scanner = new Scanner(System.in);
            System.out.println("A Program that generates a multiplication table for a specified integer n.");
            System.out.println("Enter a value of n: ");
            int n = scanner.nextInt();
            System.out.println("Multiplication Table: ");
            for (int i = 1; i <= 10; i++) {
                int result = n * i;
                System.out.println(n + " x " + i + " = " + result);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
            System.out.println("Please restart the program.");
        }


    }
}
