package D32_HashMap.D32_T1_StudentDatabase;

import D30_HashSet.D30_T3_EventRegistration_HashSet.EventRegistration;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Student Database");
        System.out.println("DC_T_1_ReantrantLock_Inside program that simulates a student database using a HashMap. The program should allow users to add student names and their corresponding IDs, retrieve student IDs using their names, display the database, and exit the program.");

        HashMap<Integer, String> studentIDs = new HashMap<>();

        System.out.println("Enter a student's ID");

        System.out.println("Enter a student's name and ID");

        Scanner scanner = new Scanner(System.in);

//        Create instances of the EventRegistration class in the main method.
        EventRegistration eventRegistrationMy = new EventRegistration();
        String givenName;
        Integer givenId;

//          Prompt the user to input.
        System.out.print("Enter a student's name or ");
        System.out.println("type end to close registration: ");
        givenName = scanner.nextLine();

        System.out.print("Enter a student's ID or ");
        givenId = Integer.parseInt(scanner.nextLine());
    }}
