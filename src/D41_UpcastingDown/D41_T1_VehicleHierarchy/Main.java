package D41_UpcastingDown.D41_T1_VehicleHierarchy;

public class Main {
    public static void main(String[] args) {

        System.out.println("- - -");
        System.out.println("Upcasting and Downcasting - Vehicle Hierarchy");
        System.out.println("A Java program that demonstrates upcasting (assigning a subclass object to a superclass reference) and downcasting (casting a superclass reference to a subclass reference) by modeling a vehicle hierarchy");

        Vehicle vehicle1 = new Car("Volvo", "Cx50", 1990);
        Vehicle vehicle2 = new Motorcycle("Honda", "Turbo", 2020);

//downcasting back to a car in order to have doors

            System.out.println("- - -");
            System.out.println(vehicle1);
        Car car1;
        if (vehicle1 instanceof Car) {
            car1 = (Car) vehicle1;
            car1.setNumberOfDoors(5);
            System.out.println("Number of Doors: " + car1.getNumberOfDoors());
        }
        vehicle1.startEngine();

//downcasting back to a car in order to have engineDisplacement
        System.out.println("- - -");
        System.out.println(vehicle2);
        Motorcycle motorcycle1;
        if (vehicle2 instanceof Motorcycle) {
            motorcycle1 = (Motorcycle) vehicle2;
            motorcycle1.setEngineDisplacement(1250);
            System.out.println("Engine Displacement: " + motorcycle1.getEngineDisplacement());

        }
        vehicle2.startEngine();
    }
}
