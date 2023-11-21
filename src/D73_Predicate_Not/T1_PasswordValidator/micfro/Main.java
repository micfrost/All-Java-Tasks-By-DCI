package D73_Predicate_Not.T1_PasswordValidator.micfro;

import java.util.Scanner;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a password: ");
        String inputPassword = scanner.nextLine();

        Predicate<String> isInvalidPassword = Predicate.not(validatePassword(inputPassword));

        if (isInvalidPassword.test(inputPassword)) {
            System.out.println("Password does not meet the requirements.");
        } else {
            System.out.println("Password is valid!");
        }
    }

    public static Predicate<String> validatePassword(String inputPassword) {
        boolean passLength = inputPassword.length() >= 8;
        boolean passUpper = inputPassword.matches(".*[A-Z]+.*");
        boolean passDigit = inputPassword.matches(".*[0-9]+.*");
        boolean passAll = passLength && passUpper && passDigit;

        Predicate<String> passwordValidation = input -> passAll;
        return passwordValidation;
    }
}
