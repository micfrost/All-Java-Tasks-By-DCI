package D63_64_Functional_Programming.DC_CA_6_LambdaReturn;

@FunctionalInterface
interface Concat {
    String concatenate(String text1, String text2);
}

public class Main {
    public static void merge(Concat c) {
        System.out.println(c.concatenate("Hello", "you"));
    }

    public static void main(String[] args) {

        //    usage of lambda expressions as a method parameters.
        Concat concat1 = (t1, t2) -> {
            String result = t1 + " " + t2;
            return result;
        };
        merge(concat1);

        Concat concat2 = (t1, t2) -> {
            return t1 + " " + t2;
        };
        merge(concat2);


        Concat concat3 = (t1, t2) -> t1 + " " + t2;
        merge(concat3);

    }


}
