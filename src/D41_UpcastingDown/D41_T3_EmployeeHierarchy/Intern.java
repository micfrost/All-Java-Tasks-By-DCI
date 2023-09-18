package D41_UpcastingDown.D41_T3_EmployeeHierarchy;

public class Intern extends Employee {

    private int durationInWeeks;

    public Intern(String name, int employeeID, double salary, int durationInWeeks) {
        super(name, employeeID, salary);
        this.durationInWeeks = durationInWeeks;
    }

    @Override
    void calculateBonus() {
        System.out.println("Bonus 4000.");
    }

    @Override
    public String toString() {

        return super.toString() +
                ", Duration In Weeks: " + durationInWeeks;
    }

    public int getDurationInWeeks() {
        return durationInWeeks;
    }
}

