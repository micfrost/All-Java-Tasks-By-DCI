package D41_UpcastingDown.D41_CA4_;

class Parent {

    void greet() {
        System.out.println("Greetings from Parent class");
    }
}

class Child extends Parent {

    void greet() {
        System.out.println("Greetings from Child class");
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println("oo");
        Object oo = new Object();//Casting for a Object
        System.out.println(oo.getClass());

        System.out.println("op");
        Object op = new Parent(); //Casting for a Parent
        System.out.println(op.getClass());

        System.out.println("pp");
        Parent pp = new Parent(); //Casting Parent
        System.out.println(pp.getClass());

        System.out.println("cc");
        Child cc = new Child(); // Casting for a child
        System.out.println(cc.getClass());

        System.out.println("o_op");
        Object o_op = Parent.class.cast(op); //Casting from Child to Parent
        System.out.println(o_op.getClass());


    }
}