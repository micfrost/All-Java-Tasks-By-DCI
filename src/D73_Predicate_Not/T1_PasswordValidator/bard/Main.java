package D73_Predicate_Not.T1_PasswordValidator.bard;


import java.util.Scanner;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a password: ");
        String password = scanner.nextLine();

        /*
         * The %s is replaced with the value.
         * The %n tells the console to print it in a new line.
         */

        boolean result = isNotValidPassword().test(password);
        System.out.printf("Result: Password %s valid.%n", result ? "is not" : "is"); // Output: Display whether the password is not valid
    }

    // Predicate to check if a password is not valid based on specified criteria
    private static Predicate<String> isNotValidPassword() {
        return Predicate.not(password ->
                password.length() >= 8 &&
                        password.matches(".*[A-Z].*") &&  // (".*[A-Z].*") - means the password must contain one uppercase letter.
                        password.matches(".*\\d.*") // (".*\\d.*") - means the password must contain one digit.
        );
    }
}