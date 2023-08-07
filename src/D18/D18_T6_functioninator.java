package D18;

import java.util.Scanner;
public class D18_T6_functioninator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a single word: ");
        String givenWord = scanner.nextLine();
        char lastChar = givenWord.charAt(givenWord.length() - 1);
        boolean isEndConsonant = (lastChar == 'a' || lastChar == 'e' || lastChar == 'o' || lastChar == 'u' || lastChar == 'i' || lastChar == 'y');
        if (isEndConsonant) {
            System.out.println("inatorInator(\"" + givenWord + "\") --> " + "\"" + givenWord + "-inator" + givenWord.length() + "000\"");
        } else {
            System.out.println("inatorInator(\"" + givenWord + "\") --> " + "\"" + givenWord + "inator" + givenWord.length() + "000\"");
        }

    }
}
