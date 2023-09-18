package D41_UpcastingDown.D41_T1_VehicleHierarchy;

public class Vehicle {
    private String brand;
    private String model;
    private int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Type of vehicle: " + this.getClass().getSimpleName() +
                "\nBrand: " + brand +
                ", Model: " + model +
                ", Year: " + year;
    }

    void startEngine() {
        System.out.println("The vehicle is starting.");
    }
}

class Car extends Vehicle {
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    private int numberOfDoors;

    public Car(String brand, String model, int year) {
        super(brand, model, year);
    }
}

class Motorcycle extends Vehicle {
    public int getEngineDisplacement() {
        return engineDisplacement;
    }

    public void setEngineDisplacement(int engineDisplacement) {
        this.engineDisplacement = engineDisplacement;
    }

    private int engineDisplacement;

    public Motorcycle(String brand, String model, int year) {
        super(brand, model, year);
    }
}

