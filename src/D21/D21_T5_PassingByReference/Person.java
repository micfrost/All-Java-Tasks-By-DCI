package D21.D21_T5_PassingByReference;

// Class
public class Person {
    String name;
    int age;

//    Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    Method
     public void displayInfo() {
        System.out.println("Persons name: " + name);
        System.out.println("Persons age: " + age);
    }
}
