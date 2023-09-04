package D33_Inheritance.D33_T1_Vehicles;


public class Bicycle extends Vehicle {
    int wheels;
    public Bicycle(int wheels) {
        this.wheels = wheels;
    }


    @Override
    public void displayInfo() {
        System.out.println();
        System.out.println("Bicycle: ");
        super.displayInfo();

        System.out.println("Wheels of the bicycle: " + this.wheels);
    }


}
