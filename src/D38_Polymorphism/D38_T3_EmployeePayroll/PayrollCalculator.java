package D38_Polymorphism.D38_T3_EmployeePayroll;

import D33_Inheritance.D33_T1_Vehicles.Car;

class Employee {
    public double calculatePayroll() {
        return 0.0;
    }
}

class PermanentEmployee extends Employee {

    private double fixedSalary;
    private double bonuses;

    public PermanentEmployee(double fixedSalary, double bonuses) {
        this.fixedSalary = fixedSalary;
        this.bonuses = bonuses;
    }

    public  double calculatePayroll() {
        return fixedSalary + bonuses;
    }
}

class ContractEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public ContractEmployee(double hourlyRate, int hoursWorked) {
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double calculatePayroll() {
        return hourlyRate * hoursWorked;
    }
}


public class PayrollCalculator {
    public static void main(String[] args) {
        System.out.println("- - - - -");
        System.out.println("Employee Payroll");
        System.out.println("DC_T_1_ReantrantLock_Inside program to calculate the payroll for different \ntypes of employees using runtime polymorphism \nand method overriding in Java.");

        Employee permanentEmployee = new PermanentEmployee(3000, 1500);
        System.out.println("- - -");
        System.out.println(permanentEmployee.getClass().getSimpleName());
        System.out.println(permanentEmployee.calculatePayroll());

        Employee contractEmployee = new ContractEmployee(50, 140);
        System.out.println("- - -");
        System.out.println(contractEmployee.getClass().getSimpleName());
        System.out.println(contractEmployee.calculatePayroll());

    }
}
