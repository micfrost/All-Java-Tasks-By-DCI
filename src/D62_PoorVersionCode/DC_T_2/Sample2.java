package D62_PoorVersionCode.DC_T_2;

//import Scanner Class missing.
import java.util.Scanner;

public class Sample2 {

    public static void main(String[] args) {

        System.out.println("Welcome to the Number Analysis Program!");

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int product = 1;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

//        explain the goal of entering a number.
//        it is not possible to gve a number -1 as a number. improve it e.g. q to quit.
        System.out.print("Enter a number (or -1 to quit): ");

        //        secure the input if given non integer input from a user ( try catch InputMismatchException)
        int num = scanner.nextInt();


        while (num != -1) {
            sum += num;
            product *= num;

            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }

            System.out.print("Enter another number (or -1 to quit): ");
            num = scanner.nextInt();
        }

        System.out.println("Sum: " + sum);
        //        define a name of a variable more precise. e.g. Multiplication
        System.out.println("Product: " + product);
        //       More precise description. e.g. Minimum number from provided numbers.
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);

        scanner.close();
    }
}