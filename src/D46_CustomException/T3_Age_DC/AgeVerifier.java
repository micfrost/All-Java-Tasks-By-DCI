package Exercise_27_09_2023;

import java.util.Scanner;

class UnderageException extends Exception {
    public UnderageException(String message) {
        super(message);
    }
}
public class AgeVerifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            if (age < 18) {
                throw new UnderageException("Access denied. You must be at least 18 years old to access the website.");
            }
            System.out.println("You are allowed to access the website.");
        } catch (UnderageException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}


