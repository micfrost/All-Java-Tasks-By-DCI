package D38_Polymorphism.D38_CA3_Poly_with_data_memebrs;

class Vehicle {
    int speedlimit = 90;
}

public class Bike extends Vehicle {
    int speedlimit = 100;//This is not considered polymorphism


    public static void main(String[] args) {
        Bike bike = new Bike();
        System.out.println(bike.speedlimit); //This is not considered polymorphism

    }
}
