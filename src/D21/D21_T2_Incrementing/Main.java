package D21.D21_T2_Incrementing;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the number: ");
        int givenInput = Integer.parseInt(scanner.nextLine());
        System.out.println("Before: " + givenInput);

//        non static
        Main myMainApp = new Main();
        myMainApp.increment(givenInput);

//        Static
        incrementStatic(givenInput);

        System.out.println("After: " + givenInput);
    }

    public void increment(int value) {
        value++;
        System.out.println("Inside the increment method: " + value);

    }

    static void incrementStatic(int value) {
        value++;
        System.out.println("Inside the (Static) increment method: " + value);
    }

}
