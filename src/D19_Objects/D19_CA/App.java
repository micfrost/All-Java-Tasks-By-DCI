package D19_Objects.D19_CA;
public class App {
    public static void main(String[] args) {

        Person person1 = new Person();
        Person person2 = new Person();
        ReturnValues value1 = new ReturnValues();

        person1.name = "Joe";
        person1.age = 40;
        person2.name = "Mary";
        person2.age = 38;

        System.out.println(person1.name);
        System.out.println(person1.age);
        System.out.println(person2.name);
        System.out.println(person2.age);
        System.out.println();

        person1.sayHello();

        String animal = value1.getAnimal();

        System.out.println(animal);

    }
}
