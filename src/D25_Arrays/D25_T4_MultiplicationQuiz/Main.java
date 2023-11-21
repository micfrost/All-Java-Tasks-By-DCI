package D25_Arrays.D25_T4_MultiplicationQuiz;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Multiplication QuizService");
        multiplicationQuiz();

    }

    public static void multiplicationQuiz() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNum1 = random.nextInt(10) + 1;
        int randomNum2 = random.nextInt(10) + 1;

        int multiplication = randomNum1*randomNum2;

        while (true) {
            System.out.println("Solve the multiplication question: " + randomNum1 + " * " + randomNum2);

            int givenInput = scanner.nextInt();

            if (multiplication == givenInput) {
                System.out.print("Perfect. Your answer is correct: ");
                System.out.println(randomNum1 + " * " + randomNum2 + " = " + randomNum1*randomNum2);
                break;
            } else {
                System.out.print("That is not a correct answer. Try one more time. ");

            }
        }

    }

}
