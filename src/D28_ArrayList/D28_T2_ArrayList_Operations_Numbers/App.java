package D28_ArrayList.D28_T2_ArrayList_Operations_Numbers;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public void run() {
        ArrayList<Integer> arrayList = new ArrayList<>();

        int chosenOption;
        do {
            menu();
            Scanner scanner = new Scanner(System.in);
            chosenOption = Integer.parseInt(scanner.nextLine());

            switch (chosenOption) {
                case 1 -> addItem(scanner, arrayList);
                case 2 -> largestNumber(scanner, arrayList);
                case 3 -> smallestNumber(scanner, arrayList);
                case 4 -> calculateAverage(scanner, arrayList);
                case 5 -> exit();
                default -> tryOneMoreTime();
            }
        } while (chosenOption != 5);
    }

    private static void menu() {
        System.out.println("- - - - - ");
        System.out.println("Menu:");
        System.out.println("1. Add a number.");
        System.out.println("2. Find the largest number.");
        System.out.println("3. Find the smallest number.");
        System.out.println("4. Calculate the average.");
        System.out.println("5. Exit");
        System.out.println("- - - - - ");
        System.out.print("Enter selected option: ");
    }

    private static void addItem(Scanner scanner, ArrayList<Integer> arrayList) {

        String givenString;
        do {
            System.out.println("- - - - - ");
            System.out.println("Add a number to the list. Type \"end\" to end adding.");
            givenString = scanner.nextLine();
            if (givenString.matches("^-?\\d\\w*")) {
                Integer givenNumber = Integer.parseInt(givenString);
                arrayList.add(givenNumber);
                System.out.println(givenNumber + " added successfully.");
                displayList(scanner, arrayList);
            }
        } while (!givenString.equals("end"));
    }


    private static void largestNumber(Scanner scanner, ArrayList<Integer> arrList) {
        if (!arrList.isEmpty()) {
            int maximumValue = arrList.get(0);
            System.out.println("- - - - - ");
            for (Integer integer : arrList) {
                if (integer > maximumValue) {
                    maximumValue = integer;
                }
            }
            System.out.println("The largest number is: " + maximumValue + ".");
        } else {
            System.out.println("The List is empty. Add a number first.");
            addItem(scanner, arrList);
        }
    }


    private static void smallestNumber(Scanner scanner, ArrayList<Integer> arrList) {
        if (!arrList.isEmpty()) {
            int minimumValue = arrList.get(0);
            System.out.println("- - - - - ");
            for (Integer integer : arrList) {
                if (integer < minimumValue) {
                    minimumValue = integer;
                }
            }
            System.out.println("The smallest number is: " + minimumValue + ".");
        } else {
            System.out.println("The List is empty. Add a number first.");
            addItem(scanner, arrList);
        }
    }


    private static void calculateAverage(Scanner scanner, ArrayList<Integer> arrList) {
        if (!arrList.isEmpty()) {
            int sum = 0;
            System.out.println("- - - - - ");
            for (Integer integer : arrList) {
                sum += integer;
            }
            System.out.println("The average of all numbers is: " + (1.0*sum/arrList.size()) + ".");
        } else {
            System.out.println("The List is empty. Add a number first.");
            addItem(scanner, arrList);
        }
    }


    private static void displayList(Scanner scanner, ArrayList<Integer> arrList) {
        if (!arrList.isEmpty()) {
            System.out.println("- - - - - ");
            System.out.println("The List: ");
            for (int i = 0; i < arrList.size(); i++) {
                Integer integer = arrList.get(i);
                System.out.println("Number " + (i + 1) + ": " + integer + ". ");
            }
        } else {
            System.out.println("The List is empty. Add a number first.");
            addItem(scanner, arrList);
        }
    }


    private static void exit() {
        System.out.println("- - - - - ");
        System.out.println("The program was closed successfully.");
    }


    private static void tryOneMoreTime() {
        System.out.println("- - - - - ");
        System.out.println("Try one more time.");
    }
}



