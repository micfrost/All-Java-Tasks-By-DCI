package D75_Singleton.CA1_singleton_design_pattern_Eager_Early;

//Singleton class - means a class can have only one instance


class Car {

//    Eager initialization or Early initialization

// Step 1
private static Car car = new Car();

// Step 2
// private constructor to avoid client applications using the constructor
    private Car(){
        System.out.println("Instance created");
    }

// Step 3
    public static Car getInstance(){
        return car;
    }
}

public class Main {
    public static void main(String[] args) {

Car car1 = Car.getInstance();
        Car car2 = Car.getInstance();
    }
}
