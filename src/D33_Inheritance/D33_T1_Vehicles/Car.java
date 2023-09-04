package D33_Inheritance.D33_T1_Vehicles;


public class Car extends Vehicle {

    private int doors;

    public void setDoors(int doors) {
        this.doors = doors;
    }

    @Override
    public void displayInfo() {
        System.out.println();
        System.out.println("Car: ");
        super.displayInfo();
        System.out.println("Number of doors: " + this.doors);
    }
}
