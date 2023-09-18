package D41_UpcastingDown.D41_T3_EmployeeHierarchy;

public class Engineer extends Employee {

    private String programmingLanguage;

    public Engineer(String name, int employeeID, double salary, String programmingLanguage) {
        super(name, employeeID, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    void calculateBonus() {
        System.out.println("Bonus 2000.");
    }

    @Override
    public String toString() {

        return super.toString() +
                ", Programming Language: " + programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }
}