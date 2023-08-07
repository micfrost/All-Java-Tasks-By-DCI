package D18;

import java.util.Scanner;
public class D18_T4_trim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide an input or not: ");
        String givenInput = scanner.nextLine();
        if (givenInput.isEmpty()) {
            System.out.println("\"" + givenInput + "\"" + " --> " + "empty string");
        } else if (givenInput.isBlank()) {
            System.out.println("\"" + givenInput + "\"" + " --> " + "only whitespaces");
        } else {
            System.out.println("\"" + givenInput + "\"" + " --> " + "not empty");
        }
    }
}
