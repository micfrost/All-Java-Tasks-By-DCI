package D28_ArrayList.D28_CA_ArrListWithCustomObjects;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        Now we are using our own data type Car from our class Car
        ArrayList<Car> cars = new ArrayList<>();

//      defining and using
        Car car0 = new Car("Volkswagen",'A');
        cars.add(car0);

        cars.add(new Car("Mercedes", 'B')); //using
        cars.add(new Car("Volvo", 'C'));
        cars.add(new Car("BMW",'D'));

//        We need to replace the whole object (only replacing the name is not enough)
        cars.set(2, new Car("Kia", 'E'));

        //      Size of a list using .size() method
        System.out.println("Printing using normal for and size() method");
        for (int i = 0; i < cars.size(); i++) {
            Car n = cars.get(i);
            System.out.println("Index" + i + ": " + n);
        }
        System.out.println("- - - - - - - - - - - - - - - - - - - - - ");


    }
}

