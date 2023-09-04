package D33_Inheritance.D33_CA;

public class Car extends Vehicle {

    public void airCondition(){
        System.out.println("Start air condition.");
    }

    @Override
    public void engine() {
        super.engine();
        System.out.println(". . . and then turn off the engine.");
    }
}
