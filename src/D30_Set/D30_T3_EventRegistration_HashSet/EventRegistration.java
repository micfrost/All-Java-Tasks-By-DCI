package D30_Set.D30_T3_EventRegistration_HashSet;
//    Create a class named EventRegistration that includes the following methods:
//registerParticipant that registers a participant for the event by adding their name to the HashSet.
//displayParticipants that displays the unique list of registered participants.

import java.util.HashSet;

public class EventRegistration {

    //    Create (Define) a Set as a Storage for Objects: use it to add there Participants and then to display the Set.
    HashSet<Participant> participantHashSetMy = new HashSet<>();

    void registerParticipant(String name) {
        Participant participant = new Participant(name);
        participantHashSetMy.add(participant);
    }

    void displayParticipants() {
        System.out.println("List of registered participants: ");
        for (Participant element : participantHashSetMy) {
            System.out.println(element);
        }
    }
}
