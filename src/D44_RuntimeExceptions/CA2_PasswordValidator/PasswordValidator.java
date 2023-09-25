package D44_RuntimeExceptions.CA2_PasswordValidator;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Password Validator");
        System.out.println("Enter a password");

        String passwordInput = scanner.nextLine();

        try {
            validatePassword(passwordInput);
            System.out.println("Password is valid.");
        } catch (IllegalArgumentException e) {
            System.out.println("Wrong: " + e.getMessage());
        }

    }

    public static void validatePassword(String password) {
//        Throw an exception because we want so.
        if (password.length() <8) {
            throw new IllegalArgumentException("Password must be at least 8 characters long.");
        }
        if (!password.matches(".*[A-Z].*")){
            throw new IllegalArgumentException("Password must contain at least one uppercase letter.");
        }

    }
}
