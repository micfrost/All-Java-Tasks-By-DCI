package D25_Arrays.D25_T3_GuessingGame;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Number Guessing Game");
        guessingGame();

    }

    public static void guessingGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNum = random.nextInt(10) + 1;

        while (true) {
            System.out.println("Guess the number: ");
            int givenInput = scanner.nextInt();

            if (randomNum == givenInput) {
                System.out.println("Perfect. You made it.");
                System.out.println("The random Number is " + randomNum + " and given number is also " + givenInput + ". Wow, so great.");
                break;
            } else {
                System.out.print("Try one more time. ");

            }
        }

    }

}
