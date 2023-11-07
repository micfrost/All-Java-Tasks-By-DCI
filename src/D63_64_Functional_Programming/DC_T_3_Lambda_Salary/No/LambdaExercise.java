package D63_64_Functional_Programming.DC_T_3_Lambda_Salary.No;

import java.util.ArrayList;
import java.util.List;

public class LambdaExercise {

    public static List<String> calculateAnnualBonuses(List<Employee> inputList) {
        List<String> result = new ArrayList<>();

        inputList.forEach(employee -> {
            double bonus = 0.0;
            if ("Manager".equals(employee.getPosition())) {
                bonus = employee.getSalary() * 0.15;
            } else if ("Developer".equals(employee.getPosition())) {
                bonus = employee.getSalary() * 0.10;
            } else if ("Intern".equals(employee.getPosition())) {
                bonus = employee.getSalary() * 0.05;
            }
            result.add("Employee: " + employee.getName() + ", Annual Bonus: " +
                    bonus);
        });

        return result;
    }
    public static void main(String[] args) {
        // Create a list of Employee objects
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", "Manager", 60000.0));
        employees.add(new Employee("Bob", "Developer", 50000.0));
        employees.add(new Employee("Charlie", "Intern", 30000.0));
        employees.add(new Employee("David", "Designer", 45000.0));
        // Call the calculateAnnualBonuses method
        List<String> annualBonuses = calculateAnnualBonuses(employees);
        // Print the original list of employees
        System.out.println("Original List of Employees:");
        employees.forEach(System.out::println);
        // Print the calculated annual bonuses
        System.out.println("Calculated Annual Bonuses:");
        annualBonuses.forEach(System.out::println);
    }
}