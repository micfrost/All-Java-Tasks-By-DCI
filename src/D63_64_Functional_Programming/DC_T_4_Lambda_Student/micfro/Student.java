package D63_64_Functional_Programming.DC_T_4_Lambda_Student.micfro;

public class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public  int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return name + ", score: " + score;
    }
}
