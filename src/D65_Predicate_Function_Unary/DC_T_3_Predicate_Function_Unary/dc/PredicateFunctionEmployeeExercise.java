package D65_Predicate_Function_Unary.DC_T_3_Predicate_Function_Unary.dc;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee {
    private String name;
    private double salary;
    private String department;
    private String gender;

    public Employee(String name, double salary, String department, String gender) {
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Employee{" +
               "name='" + name + '\'' +
               ", salary=" + salary +
               ", department='" + department + '\'' +
               ", gender='" + gender + '\'' +
               '}';
    }
}

public class PredicateFunctionEmployeeExercise {
    public static void main(String[] args) {
        // Sample list of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John Doe", 50000, "IT", "Male"));
        employees.add(new Employee("Jane Smith", 60000, "Finance", "Female"));
        employees.add(new Employee("Bob Johnson", 55000, "HR", "Male"));
        employees.add(new Employee("Mary Williams", 70000, "IT", "Female"));

        // Objective 1: Filter Employees
        Predicate<Employee> itDepartmentFilter = employee -> employee.getDepartment().equals("IT");
        List<Employee> filteredITEmployees = filterEmployees(employees, itDepartmentFilter);
        System.out.println("Filtered IT Department Employees: " + filteredITEmployees);

        // Objective 2: Transform Employee Names
        Function<Employee, String> transformEmployeeNames = employee -> {
            String title = (employee.getGender().equals("Female")) ? "Ms. " : "Mr. ";
            return title + employee.getName();
        };
        List<String> transformedNames = transformEmployeeNames(employees, transformEmployeeNames);
        System.out.println("Transformed Employee Names: " + transformedNames);
    }

    // Objective 1: Filter Employees
    public static List<Employee> filterEmployees(List<Employee> employees, Predicate<Employee> filter) {
        List<Employee> filteredEmployees = new ArrayList<>();
        for (Employee employee : employees) {
            if (filter.test(employee)) {
                filteredEmployees.add(employee);
            }
        }
        return filteredEmployees;
    }

    // Objective 2: Transform Employee Names
    public static List<String> transformEmployeeNames(List<Employee> employees, Function<Employee, String> transform) {
        List<String> transformedNames = new ArrayList<>();
        for (Employee employee : employees) {
            transformedNames.add(transform.apply(employee));
        }
        return transformedNames;
    }
}
