package D38_Polymorphism.D38_CA1_BIKE_BMX;

class Bike {
    void ride() {
        System.out.println("riding an every  bike");
    }
}

public class BMX extends Bike{

    void ride(){
        System.out.println("riding a bmx with 40 km/h");
    }
}

class Main{
    public static void main(String[] args) {
        Bike bmx = new BMX();
        bmx.ride();
    }
}
