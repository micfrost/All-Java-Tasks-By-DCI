package D24_logicalOperators.D24_T2_LogicalAND;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Voting Eligibility Checker");
        System.out.println("DC_T_1_ReantrantLock_Inside Java program to determine whether a person is eligible to vote based on age and citizenship status");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int givenAge = scanner.nextInt();


        System.out.print("Enter your citizenship status (type true for citizen, false for non-citizen: ");
        boolean isCitizen = scanner.nextBoolean();

        boolean  isEligibleToVote = givenAge>=18 && isCitizen;


        String outputText =isEligibleToVote ?
                "You are eligible to vote." :
                "You are not eligible to vote.";
        System.out.println(outputText);


        scanner.close();

    }
}
