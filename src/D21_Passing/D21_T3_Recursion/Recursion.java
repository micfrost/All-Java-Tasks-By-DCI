package D21_Passing.D21_T3_Recursion;

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int givenInput = Integer.parseInt(scanner.nextLine());
        int from = 1;
        display(from, givenInput);
    }

    public static int display(int first, int last) {

        System.out.println(first);

        if (first == last) {
            return last;
        }
        return display(first + 1, last);
    }
}
