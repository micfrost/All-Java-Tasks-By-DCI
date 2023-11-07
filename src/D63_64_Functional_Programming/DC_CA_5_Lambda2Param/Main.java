package D63_64_Functional_Programming.DC_CA_5_Lambda2Param;

@FunctionalInterface
interface  MyInterface{
    void start(String name, String lastName, int age);
}

public class Main {

    public static void main(String[] args) {

        MyInterface myInterface = (n, l, a) -> System.out.println("Name: " + n + " " + l + ", age: " + a);

        myInterface.start("Michal", "Frost", 39);

//        lambda1 to instance of MyInterface gdzie jest zdefiniowane jak printowac
        person(myInterface);
    }

    public static void person(MyInterface myInterface){
        myInterface.start("Julian", "Frost", 2);
    }
}
