package D41_UpcastingDown.D41_T3_EmployeeHierarchy;

public class Main {
    public static void main(String[] args) {
        System.out.println("- - -");
        System.out.println("Upcasting and Downcasting - Employee Hierarchy");
        System.out.println("DC_T_1_ReantrantLock_Inside Java program that demonstrates upcasting (assigning a subclass object to a superclass reference) and downcasting (casting a superclass reference to a subclass reference) by modeling an employee hierarchy.");
        System.out.println("- - -");

        Employee employee1 = new Manager("John Lotus", 101, 12000.00, 4);
        Employee employee2 = new Engineer("Tim Borsuk", 202, 8000.00, "Java");
        Employee employee3 = new Intern("Sandra Wenderson", 303, 4000.00, 16);

        System.out.println(employee1);
        employee1.calculateBonus();
        System.out.println("- - -");

        System.out.println(employee2);
        employee2.calculateBonus();
        System.out.println("- - -");

        System.out.println(employee3);
        employee3.calculateBonus();
        System.out.println("- - -");

        System.out.println();
        System.out.println("Downcasting to access the specific attributes and behaviors of Manager, Engineer, and Intern objects.");
        if (employee1 instanceof Manager) {
            Manager manager1 = (Manager) employee1;
            System.out.println("Manager's Team Size: " + manager1.getTeamSize());
        }

        if (employee2 instanceof Engineer) {
            Engineer engineer1 = (Engineer) employee2;
            System.out.println("Engineer's Programming Language: " + engineer1.getProgrammingLanguage());
        }

        if (employee3 instanceof Intern) {
            Intern intern1 = (Intern) employee3;
            System.out.println("Intern's Duration In Weeks: " + intern1.getDurationInWeeks());
        }


    }
}
