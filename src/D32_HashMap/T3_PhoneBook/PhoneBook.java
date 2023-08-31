package D32_HashMap.T3_PhoneBook;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
    Scanner scanner = new Scanner(System.in);
    HashMap<String, String> phoneBook = new HashMap<>();
    public void userInterface() {
        System.out.println("- - - - - ");
        System.out.println("Phone Book");
        System.out.println("A program that simulates a simple phone book using a HashMap. The program should allow users to add contact names and their corresponding phone numbers, look up phone numbers using contact names, display the phone book, and exit the program.");
        String chosenOption;
        do {
            menu();
            chosenOption = scanner.nextLine();
            switch (chosenOption) {
                case "1" -> addContact();
                case "2" -> lookUpPhoneNumber();
                case "3" -> displayPhoneBook();
                case "4" -> exit();
                default -> tryOneMoreTime();
            }
        } while (!chosenOption.equals("4"));
    }
    private void menu() {
        System.out.println("- - - - - ");
        System.out.println("Menu:");
        System.out.println("1. Add a contact.");
        System.out.println("2. Look up a phone number.");
        System.out.println("3. Display a phone book.");
        System.out.println("4. Exit");
        System.out.println("- - - - - ");
        System.out.print("Enter selected option: ");
    }
    private void addContact() {
        System.out.println("- - -");
        System.out.println("Enter a word and its translation separated by a space: ");
        String inputString = scanner.nextLine();
        String[] inputArray = inputString.split(" ");
        String K = inputArray[0];
        String V = inputArray[1];
        phoneBook.put(K,V);
        System.out.println("Added successfully.");
    }
    private void lookUpPhoneNumber() {
        System.out.println("- - -");
        System.out.println("Enter a word to display its translation: ");
        String wordToTranslate = scanner.nextLine();
        System.out.print(wordToTranslate + " means ");
        System.out.println(phoneBook.get(wordToTranslate));
    }
    private void displayPhoneBook() {
        System.out.println("- - - - - ");
        System.out.println("All words in a translator: ");
        for(Map.Entry m: phoneBook.entrySet()){
            System.out.println(m.getKey() + " means " + m.getValue());
        }
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
