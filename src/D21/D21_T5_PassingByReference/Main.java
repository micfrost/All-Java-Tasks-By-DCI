package D21.D21_T5_PassingByReference;

public class Main {
    public static void main(String[] args) {


        Person person1 = new Person("Janek", 48);
        System.out.println("Before the change: ");
        person1.displayInfo();

        changePerson(person1);

        System.out.println("\nAfter the change: ");
        person1.displayInfo();
    }

    public static void changePerson(Person person) {
        person.name = "Bogdan";
        person.age = 90;
    }
}
