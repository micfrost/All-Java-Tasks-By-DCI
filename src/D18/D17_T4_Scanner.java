package D18;

import java.util.Scanner;

public class D17_T4_Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your Name please: ");
        String userName = scanner.nextLine();
        System.out.println("Hello " + userName + ". Nice to meet you.");
    }
}
