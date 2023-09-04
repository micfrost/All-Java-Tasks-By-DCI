package D33_Inheritance.D33_T2_Animals;

public class Mammal extends Animal {


    String furColor;

    public Mammal(String furColor) {
        this.furColor = furColor;
    }

    @Override
    public void makeSound() {
        System.out.printf("Sounds of a %s --.||| - . . -|||| .. --|||| ..\n", this.name);
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Fur color: " + this.furColor);
    }

}
