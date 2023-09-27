package D46_CustomException.T1_UserAuthentication;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("- - -");

            System.out.println("Enter a username");
            String usernameInput = scanner.nextLine();
            System.out.print("Enter a password: ");
            String passwordInput = scanner.nextLine();

            Authentication authenticationMy = new Authentication();
            authenticationMy.authentication(usernameInput, passwordInput);

        } catch (AuthenticationException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("- - -");
            System.out.println("End of program");
            System.out.println("- - -");
        }
    }
}
