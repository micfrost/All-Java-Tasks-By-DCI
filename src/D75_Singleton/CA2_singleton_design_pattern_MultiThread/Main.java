package D75_Singleton.CA2_singleton_design_pattern_MultiThread;

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
//    it needs to by synchronized in order to have only one instance
//    double-checked locking principle
    public static Car getInstance() {
        if (car == null) {
            synchronized (Car.class) {
                if (car == null) {
                    car = new Car();
                }
            }

        }
        return car;
    }
}

public class Main {
    public static void main(String[] args) {

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Car car1 = Car.getInstance();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Car car1 = Car.getInstance();
            }
        });

        thread1.start();
        thread2.start();
    }
}
