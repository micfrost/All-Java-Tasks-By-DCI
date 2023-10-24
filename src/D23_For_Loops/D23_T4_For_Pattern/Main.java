package D23_For_Loops.D23_T4_For_Pattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("DC_T_1_ReantrantLock_Inside Program that prints a square pattern of asterisks based on a specified size n.");
        System.out.println("Enter a value of n: ");

        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
