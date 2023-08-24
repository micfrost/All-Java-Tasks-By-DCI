package D28_ArrayList.D28_T1_ShoppingList;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public void run() {

        ArrayList<String> arrList = new ArrayList<>();


        System.out.println("Menu:");
        System.out.println("1. Add an item");
        System.out.println("2. Remove an item");
        System.out.println("3. Display the list");
        System.out.println("4. End");
        System.out.print("Enter selected number: ");


        int chosenOption;
        do {

            Scanner scanner = new Scanner(System.in);

            chosenOption = Integer.valueOf(scanner.nextLine());

            switch (chosenOption) {
                case 1:
                    System.out.println(1);
                    break;
                case 2:
                    System.out.println(2);
                    break;
                case 3:
                    System.out.println(3);
                    break;
                case 4:
                    System.out.println("Exit the program");
                    break;
                default:
                    System.out.println("Try one more time.");
                    break;
            }
        } while (chosenOption != 4);
    }


    }


}
