package D30_HashSet.D30_CA_HashSet_WithCustomObject;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet<Vehicle> vehicles = new HashSet<>();

// We are creating every time the new object of a constructor Vehicle
// in purpose to add it to the vehicles Set
        vehicles.add(new Vehicle(1111, "Car"));
        vehicles.add(new Vehicle(2222, "Truck"));
        vehicles.add(new Vehicle(4444, "Mototcycle"));

//        Because we use a custom Object (constructor)
//        In Order to have HashSet working correctly
//        we need to implement hashing to a constructor
        vehicles.add(new Vehicle(1111, "Car"));


        for (Vehicle element: vehicles
             ) {
            System.out.println(element);
        }
        System.out.println();

    }




}
