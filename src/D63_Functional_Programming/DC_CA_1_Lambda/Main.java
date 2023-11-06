package D63_Functional_Programming.DC_CA_1_Lambda;

import java.util.List;
import java.util.function.Consumer;

public class Main {

    // Functional Interface is an interface that has only one method in it.4
    //Consumer Interface is a Functional Interface

    public static void main(String[] args) {

        var list = List.of("red", "blue", "pink");

        System.out.println("\n- - -\n");
        System.out.println("Consumer Interface");
        list.forEach(new Consumer<String>() {
//          This is called anonymous class. local class
            @Override
            public void accept(String str) {
                System.out.print(str);
                System.out.print(" ");
            }
        });
        System.out.println("\n\n- - -\n");


        System.out.println("Consumer Interface but shorter");
        list.forEach(System.out::println);
        System.out.println("\n- - -\n");

//        Lambda Expressions
        System.out.println("Lambda Expression with one parameter ");
        list.forEach((str) -> {
            System.out.print(str);
            System.out.print(" ");
        });
        System.out.println("\n\n- - -\n");

    }
}
