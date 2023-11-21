package D62_PoorVersionCode.DC_T_1_;

//import Scanner Class missing.
import java.util.Scanner;

public class Sample1 {

    public static void main(String[] args) {

        System.out.println("Welcome to the Simple C1!");
        Scanner scanner = new Scanner(System.in);
//        secure the input if given non integer input from a user ( try catch InputMismatchException)

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Select an operation:");
        System.out.println("1. AdditionFromMathsModule");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        int choice = scanner.nextInt();
//consume an empty line
        int result = 0;

//        switch it instead if else if combination
        if (choice == 1) {
            result = num1 + num2;
        } else if (choice == 2) {
            result = num1 - num2;
        } else if (choice == 3) {
            result = num1 * num2;
        } else if (choice == 4) {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Division by zero is not allowed.");
            }
        } else {
//            implement while loop to give a chance to try one more time
            System.out.println("Invalid operation.");
        }

        System.out.println("Result: " + result);

        scanner.close();
    }
}