package D18;

import java.util.Scanner;

public class D18_T8_Split {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide a sentence: ");
        String givenInput = scanner.nextLine();

        String firstWord = givenInput.substring(0,givenInput.indexOf(" ")) + " ";
        String output = firstWord.repeat(2) + givenInput;
        System.out.println("input --> output");
        System.out.println(givenInput + " --> " + output);
    }
}
