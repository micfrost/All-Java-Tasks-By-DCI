package D20_Methods.D20_MethodOverloading_CA;

public class Person {

    void greet() {
        System.out.println("Hello!");
    }

    void greet(String name) {
        System.out.println("Hello " + name);
    }

    void greet(int height) {

        if (height > 190) {
            System.out.println("Hello, you are sooo tall: " + height);
        } else {
            System.out.println("Hello, your height: " + height);
        }
    }

    void greet(String name, int height) {

        if (height > 190) {
            System.out.println("Hello " + name + ", you are sooo tall: " + height);
        } else {
            System.out.println("Hello " + name + ", your height: " + height);
        }
    }

}
