package D33_Inheritance.D33_T1_Vehicles;


public class Main {
    public static void main(String[] args) {

        Car carOfTheYear = new Car();

        carOfTheYear.setBrand("Volvo");
        carOfTheYear.setModel("4x4");
        carOfTheYear.setYear(2022);
        carOfTheYear.setDoors(5);
        carOfTheYear.displayInfo();

        Bicycle bicycleOfTheYear = new Bicycle(2);

        bicycleOfTheYear.setBrand("Cowboy");
        bicycleOfTheYear.setModel("2Electric");
        bicycleOfTheYear.setYear(2020);
        bicycleOfTheYear.displayInfo();


    }
}
