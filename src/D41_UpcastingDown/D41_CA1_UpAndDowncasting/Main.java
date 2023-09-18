package D41_UpcastingDown.D41_CA1_UpAndDowncasting;

class Parent {
    String name;

    void greet(){
        System.out.println("Greetings from Parent class");
    }
}

class Child extends Parent {
    int age;
    void
    greet() {
        System.out.println("Greetings from Child class");
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println("UPCASTING");
        Parent parent = new Child(); // Upcasting
        parent.name= "Bob";
        System.out.println(parent.name);
        parent.greet();
        System.out.println();

        System.out.println("DOWNCASTING");
        Child child = (Child) parent; // Downcasting

        child.age =32;
        System.out.println(child.name);
        System.out.println(child.age);
        child.greet();
    }
}
