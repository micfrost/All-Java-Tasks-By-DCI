package D22_While.D22_CA_While;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = 0;

//        While loop
        while(value<10) {
            System.out.println("Hello" + value);
            value++;
        }

//        It is executed at least once
        int number=0;
        do {
            System.out.println("Please enter a number: ");
            number = scanner.nextInt();
        } while (number != 5);
        System.out.println("Got 5!");

    }
}
