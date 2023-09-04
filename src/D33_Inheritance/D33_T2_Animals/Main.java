package D33_Inheritance.D33_T2_Animals;

public class Main {
    public static void main(String[] args) {
        Mammal horse = new Mammal("brown");
        horse.setName("Nicely");
        horse.setAge(7);
        horse.displayInfo();


        Bird parrot = new Bird("rainbow");
        parrot.setName("Sunday");
        parrot.setAge(4);
        parrot.displayInfo();

    }
}
