package D69_DoubleCollon.DC_T_3_Constructor_reference.micfro;


//  1. Create a class Car with fields for make, model, and year.
class Car {

    String make;
    String model;
    int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car: " +
                "Make: " + make +
                ", Model: " + model +
                ", Year: " + year +
                '.';
    }
}

@FunctionalInterface
interface CarFactory {
    Car carFactoring(String make, String model, int year);
}

public class Main {

    static Car createCar(CarFactory carFactory, String make, String model, int year) {
        return carFactory.carFactoring(make, model, year);
    }

    public static void main(String[] args) {

//        we are using an interface instance to define functionality by lambda expression.

        CarFactory carFactory1 = (make, model, year) -> new Car(make, model, year);
        CarFactory carFactory2 = Car::new;

        Car car1 = createCar(carFactory1, "Volvo", "S40", 1975);
        System.out.println(car1);


        Car car2 = createCar(carFactory2, "VW", "UP", 2022);
        System.out.println(car2);





        Car car3 = createCar(Car::new, "Mazda", "Nice", 1985);
        System.out.println(car3);

        Car car4 = createCar((make, model, year) -> new Car(make, model, year), "Toyota", "Yaris", 1985);
        System.out.println(car4);

    }

}


