package D31_Linked_AND_TreeSet.D31_T2_Jacq;

import java.util.Objects;
import java.util.Set;

public class Candidate {

    private String name;
    private int votes;

    public Candidate(String name) {
        this.name = name;
        votes = 1;
    }

    public Candidate(String name, int votes) {
        this(name);
        this.votes = votes;
    }

    public static void addVote(Candidate candidate, Set<Candidate> candidates) {

        if (candidates.contains(candidate)) {
            String candidateName = candidate.getName();
            int candidateVotes = -1;

            var iter = candidates.iterator();

            while (iter.hasNext()) {
                Candidate currentCandidate = iter.next();

                if (candidate.equals(currentCandidate)) {

                    candidateVotes = currentCandidate.getVotes() + 1;

                    candidates.remove(currentCandidate);
                    break;
                }
            }

            Candidate updatedCandidate = new Candidate(candidateName, candidateVotes);

            candidates.add(updatedCandidate);

        } else {
            candidates.add(candidate);
        }
    }

    public String getName() {
        return name;
    }

    public int getVotes() {
        return votes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Candidate candidate = (Candidate) o;
        return Objects.equals(name, candidate.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return String.format("%s - %d", name, votes);
    }

}
