package D28_ArrayList.D28_CA_ArrListWithCustomObjects;

public class Car {

    String brandName;
    char serialNumber;

    //    Special Method without return is a Constructor
    public Car(String brandName, char serialNumber) {
        this.brandName = brandName;
        this.serialNumber = serialNumber;
    }

    //    To print the string not only an address of a string
    public String toString() {
        return "SerialNumber: " + serialNumber + ", " + "\tBrandname: " + brandName ;
    }


}
