package D21_Passing.D21_T1_PassByValue;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the first number: ");
        int givenInput1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Type the second number: ");
        int givenInput2 = Integer.parseInt(scanner.nextLine());

        System.out.println("Input1: " + givenInput1 + ", Input2: " + givenInput2);

        Main myMainApp = new Main();
        myMainApp.swap(givenInput1, givenInput2);
        System.out.println("Swapped two numbers");

        System.out.println("Output1: " + myMainApp.swapped1 + ", Output2: " + myMainApp.swapped2);
        scanner.close();
    }

    int swapped1;
    int swapped2;

    public void swap(int value1, int value2) {

        swapped1 = value2;
        swapped2 = value1;
    }


}