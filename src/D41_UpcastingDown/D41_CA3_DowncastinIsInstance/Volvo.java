package D41_UpcastingDown.D41_CA3_DowncastinIsInstance;

class Car {
}


public class Volvo extends Car {

    public static void method(Car c) {

        if (Volvo.class.isInstance(c)) {
            Volvo v = (Volvo) c;
            System.out.println("Downcasting performed.");
        } else {
            System.out.println("Downcasting not performed.");
        }
    }

    public static void main(String[] args) {

       Car c = new Volvo();
        Volvo.method(c);

    }
}
