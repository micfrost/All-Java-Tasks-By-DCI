package D31_Linked_AND_TreeSet.D31_T1_SET_UniqueNumberCounter;
import java.util.*;
public class UniqueNumberCounter {

    Scanner scanner = new Scanner(System.in);
    LinkedHashSet<Integer> SetOfNumbers = new LinkedHashSet<>();
    int count=1;

    public void userInterface() {
        System.out.println("- - - - - ");
        System.out.println("Unique Number Counter");
        System.out.println("DC_T_1_ReantrantLock_Inside program that takes a sequence of numbers as input \nand counts the number of unique numbers using a Set. ");
        String chosenOption;

        do {
            menu();
            chosenOption = scanner.nextLine();
            switch (chosenOption) {
                case "1" -> addNumbers();
                case "2" -> countUniqueNumbers();
                case "3" -> displayUniqueNumbers();
                case "4" -> exit();
                default -> tryOneMoreTime();
            }
        } while (!chosenOption.equals("4"));
    }
    private void menu() {
        System.out.println("- - - - - ");
        System.out.println("Menu:");
        System.out.println("1. Add numbers to the Set.");
        System.out.println("2. Count unique numbers");
        System.out.println("3. Display unique numbers and its count");
        System.out.println("4. Exit");
        System.out.println("- - - - - ");
        System.out.print("Enter selected option: ");
    }

    private void addNumbers() {
        System.out.println("- - - - - ");
        System.out.println("Enter Set of numbers separated by spaces: ");

        String[] inputNumbers = scanner.nextLine().split(" ");
        for (String element : inputNumbers) {
            int num = Integer.parseInt(element);
            SetOfNumbers.add(num);
        }
        System.out.println("Numbers added to the set successfully.");
    }

    private void countUniqueNumbers() {
        int countUniqueNumbers = SetOfNumbers.size();
        System.out.println("Unique numbers: " +countUniqueNumbers);
    }

    private void displayUniqueNumbers() {
        System.out.println("Set of unique numbers: ");
        for (int element : SetOfNumbers
        ) {
            System.out.print(element + " ");
            count++;
        }
        System.out.println();
    }

    private void exit() {
        System.out.println("- - - - - ");
        System.out.println("The program was closed successfully.");
    }
    private void tryOneMoreTime() {
        System.out.println("- - - - - ");
        System.out.println("Try one more time.");
    }
}
