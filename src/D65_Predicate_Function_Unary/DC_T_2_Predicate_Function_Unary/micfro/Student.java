package D65_Predicate_Function_Unary.DC_T_2_Predicate_Function_Unary.micfro;

public class Student {

    String name;
    double dpa;
    boolean isEnroll;
    boolean isGraduated;

    public boolean isGraduated() {
        return isGraduated;
    }

    public void setGraduated(boolean graduated) {
        isGraduated = graduated;
    }

    public Student(String name, double dpa, boolean isEnroll, boolean isGraduated) {
        this.name = name;
        this.dpa = dpa;
        this.isEnroll = isEnroll;
        this.isGraduated = isGraduated;
    }

    @Override
    public String toString() {
        return "Student: " +
                "\t" + name  +
                "\t, dpa:" + dpa+
                ".";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDpa() {
        return dpa;
    }

    public void setDpa(double dpa) {
        this.dpa = dpa;
    }

    public boolean isEnroll() {
        return isEnroll;
    }

    public void setEnroll(boolean enroll) {
        isEnroll = enroll;
    }
}
