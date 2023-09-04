package D33_Inheritance.D33_T3_Employees;

public class Main {
    public static void main(String[] args) {

        Manager manager1 = new Manager(5000, 2023);
        manager1.setName("Jan");
        manager1.setEmployeeID(1025);
        manager1.displayInfo();

        Developer developer1 = new Developer(50.52, 80);
        developer1.setName("Tom");
        developer1.setEmployeeID(4266);
        developer1.displayInfo();
    }
}
