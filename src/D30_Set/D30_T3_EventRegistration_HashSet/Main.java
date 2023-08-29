package D30_Set.D30_T3_EventRegistration_HashSet;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("- - - - - ");

        Scanner scanner = new Scanner(System.in);

//        Create instances of the EventRegistration class in the main method.
        EventRegistration eventRegistrationMy = new EventRegistration();
        String givenName;

        do {
//          Prompt the user to input participant names.
            System.out.print("Add a name of a participant or ");
            System.out.println("type end to close registration: ");
            givenName = scanner.nextLine();

//          Register the input participants for the event.
            if ((!givenName.equalsIgnoreCase("end"))) {
                eventRegistrationMy.registerParticipant(givenName);
            }
            System.out.println("- - - - - ");

        } while (!givenName.equalsIgnoreCase("end"));

//        Display the unique list of registered participants.
        eventRegistrationMy.displayParticipants();

        System.out.println("- - - - - ");
        System.out.println("The program was closed successfully. ");

    }
}
