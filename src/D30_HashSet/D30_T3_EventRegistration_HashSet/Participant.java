package D30_HashSet.D30_T3_EventRegistration_HashSet;


//    Create a class named Participant with the following attribute:
//    String name: to store the name of the participant.
public class Participant {

   private final String name;

    public Participant(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Participant: name= " + name + ".";
    }
}
