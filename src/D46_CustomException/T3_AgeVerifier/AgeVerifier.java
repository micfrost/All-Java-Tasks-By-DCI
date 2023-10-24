package D46_CustomException.T3_AgeVerifier;

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

            System.out.println();
            System.out.println("Custom Exception Handling - Age Verification");
            System.out.println("DC_T_1_ReantrantLock_Inside program that simulates age verification for accessing a website.");
            System.out.println();

            System.out.println("Enter your age.");

            int ageInput = Integer.parseInt(scanner.nextLine());

            if (ageInput < 18) {
                throw new UnderageException("Oh no: too young");
            } else {
                System.out.println("Success");
            }
        } catch (UnderageException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
