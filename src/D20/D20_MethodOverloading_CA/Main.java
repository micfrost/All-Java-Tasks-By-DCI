package D20.D20_MethodOverloading_CA;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.greet();
        person.greet("John");
        person.greet(175);
        person.greet("John",195);
    }
}
