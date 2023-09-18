package D41_UpcastingDown.D41_T3_EmployeeHierarchy;

public class Manager extends Employee {

    private int teamSize;

    public Manager(String name, int employeeID, double salary, int teamSize) {
        super(name, employeeID, salary);
        this.teamSize = teamSize;
    }

    @Override
    void calculateBonus() {
        System.out.println("Bonus 1000.");
    }

    @Override
    public String toString() {

        return super.toString() +
                ", teamSize: " + teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }
}
