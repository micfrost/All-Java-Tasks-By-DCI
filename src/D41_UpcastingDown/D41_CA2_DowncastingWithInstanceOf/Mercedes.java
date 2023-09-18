package D41_UpcastingDown.D41_CA2_DowncastingWithInstanceOf;


class Car {
}


public class Mercedes extends Car {

    public static void method(Car carExample) {

        if (carExample instanceof Mercedes) {
            Mercedes m = (Mercedes) carExample;
            System.out.println("Downcasting performed.");
        } else {
            System.out.println("Downcasting not performed.");
        }
    }

    public static void main(String[] args) {

        Car myCar = new Mercedes();
        Mercedes.method(myCar);

    }
}
