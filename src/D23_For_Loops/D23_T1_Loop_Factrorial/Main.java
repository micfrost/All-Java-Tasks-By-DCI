package D23_For_Loops.D23_T1_Loop_Factrorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("DC_T_1_ReantrantLock_Inside program that calculates the factorial of a given positive integer n.");
        System.out.println("Enter a value of n: ");

        int n = Integer.valueOf(scanner.nextLine());

        if (n<0) {
            System.out.println("The number you entered is not a positive number.");
        } else {

            int factorialValue = 1;

            for (int i = 1; i <= n; i++) {
                factorialValue = factorialValue * i;
                System.out.println("Result in a Loop for i= " + i + " is : " + factorialValue);
            }
            System.out.println("End Result. Factorial of " + n + " is: " + factorialValue);

            scanner.close();
        }
    }
}
