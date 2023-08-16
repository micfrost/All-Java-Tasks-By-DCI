package D23_For_Loops.D23_T2_For_EvenNum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("A program that prints all even numbers between a specified range of integers.");
        System.out.println("Enter the starting value of the range");
        int start = scanner.nextInt();
        System.out.println("Enter the ending value of the range");
        int end = scanner.nextInt();
        System.out.print("All even numbers between " + start + " and " + end + " are : ");
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }
}
