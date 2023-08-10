package D21.D21_T5_PassingByReference;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Janek", 48);
        person1.displayInfo();

        person1.changePerson("Bogus", 100);
        System.out.println("After the change: ");
        person1.displayInfo();
    }
}
