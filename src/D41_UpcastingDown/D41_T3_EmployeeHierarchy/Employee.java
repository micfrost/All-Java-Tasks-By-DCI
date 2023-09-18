package D41_UpcastingDown.D41_T3_EmployeeHierarchy;

abstract public class Employee {
    private String name;
    private int employeeID;
    private double salary;

   abstract void calculateBonus();

    public Employee(String name, int employeeID, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee "+ name +
                "\nemployeeID: " + employeeID +
                ", salary: " + salary ;
    }


}
