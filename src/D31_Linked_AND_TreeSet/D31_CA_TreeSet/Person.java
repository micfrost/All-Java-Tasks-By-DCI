package D31_Linked_AND_TreeSet.D31_CA_TreeSet;


import D31_Linked_AND_TreeSet.D31_T2_VotingSystem.Candidate;

// Implement so the class use it.
public class Person implements Comparable<Person> {

    String name;
    int age;

    public Person(String name, int age) {
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "name: "+ name + ", age: " + age +
                ".";
    }





//    NATURAL INTEGER ORDER
//    @Override
//    public int compareTo(Person other) {
//        return Integer.compare(age, other.age);
//    }

//        REVERSE NATURAL INTEGER ORDER
    @Override
    public int compareTo(Person other) {
        return Integer.compare(other.age, age);
    }



//    SORT STRING
//    This method shows automatically because the implements is used here.
//    Alphabetical order
//    @Override
//    public int compareTo(Person other) {
//        return name.compareTo(other.name);
//    }

//    It orders the Set in reverse direction.

//    @Override
//    public int compareTo(Person other) {
//        return other.name.compareTo(name);
//    }

    // If votes are equal compare names !!!
//    public int compareTo(Candidate other) {
//        int voteComparison = Integer.compare(other.votesCounter, votesCounter);
//        if (voteComparison == 0) {
//            return name.compareTo(other.name);
//        }
//        return voteComparison;
//    }

}
