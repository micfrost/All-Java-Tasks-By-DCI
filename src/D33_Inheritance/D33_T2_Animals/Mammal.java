package D33_Inheritance.D33_T2_Animals;

public class Mammal extends Animal {


    String furColor;

    public Mammal(String furColor) {
        this.furColor = furColor;
    }

    @Override
    public void makeSound() {
        System.out.println("Sounds of a mammal --.||| - . . -|||| .. --|||| ..");
    }

}
