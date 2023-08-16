package D22_While.D22_CA_Do_While;

import java.util.Scanner;

public class CheckPassword {
    public static void main(String[] args) {

       String userPassword = "secured";
        Scanner scanner = new Scanner(System.in);
        String password = null;
        // declare here to have access to var in do and while Block

        do {
            System.out.println("Enter your password: ");
            password = scanner.nextLine();
        } while (!password.equals(userPassword));

        System.out.println("Access granted.");
    }

}
