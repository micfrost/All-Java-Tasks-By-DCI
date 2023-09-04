package D33_Inheritance.D33_T3_Employees;

public class Developer extends Employee {

    double hourlyRate;
    int hoursWorked;

    public Developer(double hourlyRate, int hoursWorked) {
        this.hourlyRate=hourlyRate;
        this.hoursWorked=hoursWorked;
    }

    @Override
    public void calculateSalary(){
        System.out.printf("Salary: %.2f€.\n",(hourlyRate*hoursWorked));
    }
}
