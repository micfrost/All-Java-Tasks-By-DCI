package D75_Singleton.CA2_singleton_design_pattern_Lazy;

//Singleton class - means a class can have only one instance


class Car {

//    Lazy initialization

    // Step 1
    private static Car car;

    // Step 2
// private constructor to avoid client applications using the constructor
    private Car() {
        System.out.println("Instance created");
    }

    // Step 3
    public static Car getInstance() {
        if (car == null) {
            car = new Car();
        }
        return car;
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = Car.getInstance();
        Car car2 = Car.getInstance();
    }
}
