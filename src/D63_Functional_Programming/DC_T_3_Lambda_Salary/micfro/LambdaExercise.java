package D63_Functional_Programming.DC_T_3_Lambda_Salary.micfro;

import java.util.ArrayList;
import java.util.List;

public class LambdaExercise {


    static List<String> calculateAnnualBonuses(List<Employee> inputList){

        List<String> outputList = new ArrayList<>();

        inputList.forEach(employee -> {
            double bonus = 0.0;
            if ("Menager".equals(employee.getPosition())) {
                bonus = employee.getSalary() * 0.15;
            } else if ("Developer".equals(employee.getPosition())) {
                bonus = employee.getSalary() * 0.1;
            } else if ("Intern".equals(employee.getPosition())) {
                bonus = employee.getSalary() * 0.05;
            } outputList.add("Employee:" + employee.getName() + ", Annual Bonus: " + bonus);

        });
        
        return outputList;
    }

    public static void main(String[] args) {

         // Create a list of Employee objects
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John Smith", "Manager", 50000.0));
        employees.add(new Employee("Timotheus Golden", "Developer", 40000.0));
        employees.add(new Employee("Brit Foten", "Intern", 30000.0));

        // Call the "calculateAnnualBonuses" method with the list of employees to calculate the annual bonuses.
        List<String> annualBonuses = calculateAnnualBonuses(employees);


        // Print the following:
        //The original list of employees (name, position, salary).
        System.out.println("- - - ");
        System.out.println("Original List of Employees:");
        employees.forEach(System.out::println);


        // Print the following:
        //The calculated annual bonuses for each employee (name and bonus amount).
        System.out.println("- - - ");
        System.out.println("Calculated Annual Bonuses:");
        annualBonuses.forEach(System.out::println);


        System.out.println("- - - ");
        System.out.println("The program has ended successfully.");
    }
}
