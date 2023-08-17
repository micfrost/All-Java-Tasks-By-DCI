package D24_logicalOperators.D24_T3_LogicalAND;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Admission Eligibility Checker");
        System.out.println("Java program to check whether a student is eligible for admission based on their high school GPA and SAT score.");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your GPA score: ");
        double givenGPA = scanner.nextDouble();

        System.out.print("Enter your SAT score: ");
        double givenSAT = scanner.nextInt();

        boolean isEligibleForAdmission = givenGPA>=3.5 && givenSAT>=1500;

        String outputText = isEligibleForAdmission ?
                "You are eligible for admission." :
                "You are not eligible for admission.";
        System.out.println(outputText);

    }
}
