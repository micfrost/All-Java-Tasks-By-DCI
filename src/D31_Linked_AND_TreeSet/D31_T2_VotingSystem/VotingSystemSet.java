package D31_Linked_AND_TreeSet.D31_T2_VotingSystem;

import java.util.*;

public class VotingSystemSet {
    Scanner scanner = new Scanner(System.in);

   Set<Candidate> candidateSet = new TreeSet<>();

    int allVotes;

    public void userInterface() {
        System.out.println("- - - - - ");
        System.out.println("Voting System");
        System.out.println("DC_T_1_ReantrantLock_Inside program that simulates a simple voting system using a Set. The program should allow users to cast votes for candidates, count the votes, display the vote count for each candidate");
        String chosenOption;

        do {
            menu();
            chosenOption = scanner.nextLine();
            switch (chosenOption) {
                case "1" -> addCandidate();
                case "2" -> castVote();
                case "3" -> countAllVotes();
                case "4" -> displayVotes();
                case "5" -> exit();
                default -> tryOneMoreTime();
            }
        } while (!chosenOption.equals("5"));
    }

    private void menu() {
        System.out.println("- - - - - ");
        System.out.println("Menu:");
        System.out.println("1. Proposing a person as a Candidate.");
        System.out.println("2. Cast a vote.");
        System.out.println("3. Count votes");
        System.out.println("4. Display vote");
        System.out.println("5. Exit");
        System.out.println("- - - - - ");
        System.out.print("Enter selected option: ");
    }

    private void addCandidate() {
        System.out.println("- - - - - ");
        System.out.println("Enter a Set of candidates separated by spaces: : ");
        String input = scanner.nextLine();
        String[] inputSetCandidates = input.split(" ");
        int currentVotesCounter = 0;
        for (String givenName : inputSetCandidates) {
            candidateSet.add(new Candidate(givenName, currentVotesCounter));
        }
        System.out.println("Candidates added to the set successfully.");
        displayVotes();
    }


    private void castVote() {
        System.out.println("- - - - - ");
        System.out.println("Cast a vote for a candidate: ");
        String givenName = scanner.nextLine();
        for (Candidate element : candidateSet) {
            if (element.name.equals(givenName)) {
                element.votesCounter++;
                System.out.println(element);
                allVotes++;
            }
        }
    }

    private void displayVotes() {
        System.out.println("- - - - - ");
        System.out.println("All candidates and their current votes: ");
        for (Candidate element : candidateSet) {
            System.out.println(element);
        }
    }

    private void countAllVotes() {
        System.out.println("- - - - - ");
        System.out.println("All already added votes: " + allVotes);
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