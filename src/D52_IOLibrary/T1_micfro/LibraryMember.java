package D52_IOLibrary.T1_micfro;

import java.util.ArrayList;

public class LibraryMember {

    private ArrayList<Person> members;
    public LibraryMember(){
        members = new ArrayList<>();
    }

    void addMember(Person person) {
        members.add(person);
    }

}
