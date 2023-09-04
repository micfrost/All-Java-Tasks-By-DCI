package D33_Inheritance.D33_T2_Animals;

public class Main {
    public static void main(String[] args) {
        Mammal horse = new Mammal("brown");
        horse.setName("Nicely");
        horse.setAge(7);
        horse.displayInfo();


        Bird parot = new Bird("rainbow");
        parot.setName("Sunday");
        parot.setAge(4);
        parot.displayInfo();

    }
}
