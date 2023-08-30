package D31_Linked_AND_TreeSet.D31_T2_VotingSystem;


public class Candidate implements Comparable<Candidate> {

    String name;
    int votesCounter;

    public Candidate(String name, int votesCounter) {
        this.name = name;
        this.votesCounter = votesCounter;

    }

    @Override
    public String toString() {
        return "Name: " + name + ", Votes: " + votesCounter;
    }



    // If votes are equal compare names !!!
    public int compareTo(Candidate other) {
        int voteComparison = Integer.compare(other.votesCounter, votesCounter);
        if (voteComparison == 0) {
            return name.compareTo(other.name);
        }
        return voteComparison;
    }


    //    NATURAL INTEGER ORDER
//    @Override
//    public int compareTo(Candidate other) {
//        return Integer.compare(other.votesCounter, votesCounter);
//    }

//    @Override
//    public int compareTo(Candidate other) {
//        return name.compareTo(other.name);
//    }
}


