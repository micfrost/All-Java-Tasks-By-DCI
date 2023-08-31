package D32_HashMap.D32_T2_LanguageTranslator;
import java.util.*;
public class LanguageTranslator {
    Scanner scanner = new Scanner(System.in);
    HashMap<String, String> languageTranslator = new HashMap<>();
    public void userInterface() {
        System.out.println("- - - - - ");
        System.out.println("Language Translator");
        System.out.println("A program that simulates a simple language translator using a HashMap. The program should allow users to add word translations, look up translations, display the translator's contents, and exit the program.");
        String chosenOption;
        do {
            menu();
            chosenOption = scanner.nextLine();
            switch (chosenOption) {
                case "1" -> addTranslation();
                case "2" -> lookUpTranslation();
                case "3" -> displayTranslator();
                case "4" -> exit();
                default -> tryOneMoreTime();
            }
        } while (!chosenOption.equals("4"));
    }
    private void menu() {
        System.out.println("- - - - - ");
        System.out.println("Menu:");
        System.out.println("1. Add translation.");
        System.out.println("2. Look up translation.");
        System.out.println("3. Display translator.");
        System.out.println("4. Exit");
        System.out.println("- - - - - ");
        System.out.print("Enter selected option: ");
    }
    private void addTranslation() {
        System.out.println("- - -");
        System.out.println("Enter a word and its translation separated by a space: ");
        String inputString = scanner.nextLine();
        String[] inputArray = inputString.split(" ");
        String K = inputArray[0];
        String V = inputArray[1];
        languageTranslator.put(K,V);
        System.out.println("Added successfully.");
    }
    private void lookUpTranslation() {
        System.out.println("- - -");
        System.out.println("Enter a word to display its translation: ");
        String wordToTranslate = scanner.nextLine();
        System.out.print(wordToTranslate + " means ");
        System.out.println(languageTranslator.get(wordToTranslate));
        }
    private void displayTranslator() {
        System.out.println("- - - - - ");
        System.out.println("All words in a translator: ");
        for(Map.Entry m: languageTranslator.entrySet()){
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