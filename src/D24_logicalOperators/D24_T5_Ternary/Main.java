package D24_logicalOperators.D24_T5_Ternary;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Grade C1 with Ternary Operator");
        System.out.println("Java program to calculate the letter grade for a student based on their numerical score.");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the numerical score: ");
        int givenNumericalScore = scanner.nextInt();

        char letterGrade = givenNumericalScore >= 90 ? 'A'
                : givenNumericalScore >= 80 ? 'B'
                : givenNumericalScore >= 70 ? 'C'
                : givenNumericalScore >= 60 ? 'D'
                : 'F';


        System.out.println("Your given numerical score is " + givenNumericalScore + " and a letter grade is: " + letterGrade + ".");


    }

}
