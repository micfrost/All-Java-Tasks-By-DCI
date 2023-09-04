package D33_Inheritance.D33_T3_Employees;

public class Manager extends Employee {

    double baseSalary;
    double bonus;

    public Manager(double baseSalary, double bonus) {
        this.baseSalary=baseSalary;
        this.bonus=bonus;
    }
    @Override
    public void calculateSalary(){

        System.out.printf("Salary: %.2f€.\n",(baseSalary+bonus));
    }
}
