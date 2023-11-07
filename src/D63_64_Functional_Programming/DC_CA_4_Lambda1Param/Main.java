package D63_64_Functional_Programming.DC_CA_4_Lambda1Param;

@FunctionalInterface
interface MyInterface {
    void start(String textInput);
}

public class Main {
    public static void main(String[] args) {

        MyInterface lambda1 = (String textInput) -> {
            System.out.println(textInput);
        };
        lambda1.start("Hey There from lambda1.");

        MyInterface lambda2 = (textInput) -> {
            System.out.println(textInput);
        };
        lambda2.start("Hey There from lambda2.");

        MyInterface lambda3 = (t) -> {
            System.out.println(t);
        };
        lambda3.start("Hey There from lambda3.");

        MyInterface lambda4 = t -> System.out.println(t);;
        lambda4.start("Hey There from lambda4.");
    }
}
