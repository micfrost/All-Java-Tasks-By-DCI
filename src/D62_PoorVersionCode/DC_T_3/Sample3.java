package D62_PoorVersionCode.DC_T_3;

//import Scanner Class missing.
import java.util.Scanner;

public class Sample3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        use while loop to give a chance to run a program one more time.
        System.out.println("Text Processing Program");
        //        explain the goal of entering a sentence - what kind of analyse provides the program.

        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        // Task 1: Count the number of words in the sentence.
        int wordCount = 0;
        String[] words = input.split(" ");
        for (String word : words) {
            if (!word.isEmpty()) {
                wordCount++;
            }
        }
        System.out.println("Word count: " + wordCount);

        // Task 2: Find and print the longest word in the sentence.
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println("Longest word: " + longestWord);

        // Task 3: Remove vowels from the sentence.
        String noVowels = input.replaceAll("[AEIOUaeiou]", "");
        System.out.println("Sentence without vowels: " + noVowels);

        scanner.close();
    }
}