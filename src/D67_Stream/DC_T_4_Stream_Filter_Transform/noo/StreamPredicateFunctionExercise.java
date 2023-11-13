package D67_Stream.DC_T_4_Stream_Filter_Transform.noo;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private int age;
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class StreamPredicateFunctionExercise {
    public static List<String> filterAndTransform(List<Employee> employees, Predicate<Employee> predicate, Function<Employee, String> transformer) {
// Filter employees based on the specified Predicate and transform using the specified Function
        return employees.stream()
                .filter(predicate)
                .map(transformer)
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {
// Create a list of employees with various names and ages
        List<Employee> employees = List.of(
                new Employee("Alice", 25),
                new Employee("Bob", 32),
                new Employee("Charlie", 28),
                new Employee("Diana", 40),
                new Employee("Eva", 22)
        );
// Define a Predicate to filter employees below the age of 30
        Predicate<Employee> agePredicate = employee -> employee.getAge() < 30;
// Define a Function to transform employees to a String format
        Function<Employee, String> transformToName = Employee::getName;
// Call the filterAndTransform method to filter and transform employees
        List<String> transformedResults = filterAndTransform(employees, agePredicate, transformToName);
// Print the original list of employees
        System.out.println("Original List of Employees:");
        employees.forEach(System.out::println);
// Print the filtered employees and the transformed results
        System.out.println("Filtered Employees (Below 30) and Transformed Results:");
        transformedResults.forEach(System.out::println);
    }
}