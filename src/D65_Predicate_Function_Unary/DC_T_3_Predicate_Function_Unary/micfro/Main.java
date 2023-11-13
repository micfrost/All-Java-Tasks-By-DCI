package D65_Predicate_Function_Unary.DC_T_3_Predicate_Function_Unary.micfro;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>(List.of(
                new Employee("Michal Frost", "Male", 5000, "IT"),
                new Employee("Julian Frost", "Male", 8000, "CEO"),
                new Employee("Aleksa Frost", "Female", 6000, "HR")
        ));

//  Original List
        System.out.println("- - -");
        System.out.println("Original List");
        employeeList.forEach(element -> {
            System.out.println(element);
        });


//     Objective 1: Filter Employees
        System.out.println("- - -");
        System.out.println("Filtered List. Salary more than 7000€");
        Predicate<Employee> predicate = employee -> employee.getSalary() >7000;
        List<Employee> filteredEmployees = filterEmployees(employeeList, predicate);
        filteredEmployees.forEach(System.out::println);


//    Objective 2: Transform Employee Names
        System.out.println("- - - ");
        System.out.println("Transformed List");
        List<Employee> transformedList= transformEmployeeNames(employeeList, employee -> employee.getGender().equals("Male")
                ? "Mr. " + employee.getName()
                : "Ms. " + employee.getName());
        transformedList.forEach(System.out::println);

    }

    //    Objective 1: Filter Employees

    public static List<Employee> filterEmployees(List<Employee> employeeList, Predicate<Employee> predicate) {
        List<Employee> filteredEmployees = new ArrayList<>();
        for (Employee employee : employeeList) {
            if (predicate.test(employee)) {
                filteredEmployees.add(employee);
            }
        }
        return filteredEmployees;
    }


    //    Objective 2: Transform Employee Names
    public static List<Employee> transformEmployeeNames(List<Employee> employeeList, Function<Employee, String> nameTransformer) {
        List<Employee> transformedList = new ArrayList<>();
        for (Employee employee : employeeList) {
            String transformedName = nameTransformer.apply(employee);
            employee.setName(transformedName);
            transformedList.add(employee);
        }
        return transformedList;
    }

}

