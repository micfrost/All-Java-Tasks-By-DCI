package D30_HashSet.D30_CA_HashSet_WithCustomObject;

import java.util.Objects;

public class Vehicle {


    int serialNumber;
    String type;

    public Vehicle(int serialNumber, String type) {
        this.serialNumber = serialNumber;
        this.type = type;
    }


    //    It helps with printing actually values of an Object-
    @Override
    public String toString() {
        return "Vehicle: " +
                "serialNumber=" + serialNumber +
                ", type='" + type + '\'';
    }

//    It makes sure that hashing works correctly with custom object (using a constructor)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return serialNumber == vehicle.serialNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialNumber);
    }
}




