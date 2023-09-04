package D33_Inheritance.D33_CA;

public class Main {
    public static void main(String[] args) {


        Vehicle vehicle = new Vehicle();
        System.out.println();
        System.out.println("1 VEHICLE");
        vehicle.engine();
        vehicle.drive();


        Car car = new Car();
        System.out.println();
        System.out.println("1.1 VEHICLE -> CAR ");
        car.engine();
        car.drive();
        car.airCondition();

        Truck truck = new Truck();
        System.out.println();
        System.out.println("1.2 VEHICLE -> MOTORBIKE ");
        truck.engine();
        truck.drive();
        truck.load();

        Motorcycle motorcycle = new Motorcycle();
        System.out.println();
        System.out.println("1.3 VEHICLE -> MOTORBIKE ");
        motorcycle.engine();
        motorcycle.drive();
        motorcycle.extraSpeed();


        SelfDrivingCar selfDrivingCar = new SelfDrivingCar();
        System.out.println();
        System.out.println("1.1.1 VEHICLE -> CAR -> SELFDRIVINGCAR");
        selfDrivingCar.engine();
        selfDrivingCar.drive();
        selfDrivingCar.airCondition();
        selfDrivingCar.selfDriving();

    }
}
