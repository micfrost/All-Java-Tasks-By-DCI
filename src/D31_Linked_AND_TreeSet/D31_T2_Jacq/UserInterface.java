package D31_Linked_AND_TreeSet.D31_T2_Jacq;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UserInterface {

    private Scanner scanner;
    private Set<Candidate> candidates;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        candidates = new HashSet<>();
    }

    public void run() {
        System.out.println("Vote Counter");

        while (true) {
            System.out.println("Select from the following options:");
            System.out.println("1 - Cast a vote");
            System.out.println("2 - Count votes");
            System.out.println("3 - Display vote count");
            System.out.println("4 - Exit\n");

            System.out.print("Enter choice: ");

            int choice;

            try {
                choice = Integer.valueOf(scanner.nextLine());

                if (choice < 1 || choice > 4) {
                    System.out.println("\nSelect a number between 1 and 4.\n");
                    continue;
                }

            } catch (NumberFormatException e) {
                System.out.println("\nEnter a valid number!\n");
                continue;
            }

            if (choice == 1) {
                vote();
                continue;
            }

            if (choice == 2) {
                countVotes();
            }

            if (choice == 3) {
                displayVoteCount();
            }

            if (choice == 4) {
                System.out.println("Good Bye!");
                break;
            }
        }
    }

    public void vote() {
        System.out.print("\nCast your vote: ");

        String candidateName = scanner.nextLine();

        Candidate newCandidate = new Candidate(candidateName);

        Candidate.addVote(newCandidate, candidates);

        System.out.println("\nYour vote was cast\n");
    }

    public void countVotes() {
        int numberOfCandidates = candidates.size();

        if (numberOfCandidates == 1) {
            System.out.printf("\nThere is %d candidate.\n\n", numberOfCandidates);
        } else {
            System.out.printf("\nThere are %d candidates.\n\n", numberOfCandidates);
        }
    }

    public void displayVoteCount() {
        System.out.println("\nVotes");
        for (Candidate candidate : candidates) {
            System.out.println(candidate);
        }
        System.out.println();
    }

}
