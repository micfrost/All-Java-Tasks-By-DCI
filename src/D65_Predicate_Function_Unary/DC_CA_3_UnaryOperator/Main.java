package D65_Predicate_Function_Unary.DC_CA_3_UnaryOperator;

import java.util.function.UnaryOperator;

public class Main {

    /* Rules to keep in mind:
     * Interface extends another Interface
     * Class implements another Interface
     * Class extends another Class
     *
     * public interface Function<T,R> 		"R"= return
     * public interface UnaryOperator extends Function<T,R>
     * they have only one method together
     * UnaryOperator inherits the apply() from Function<T,R>
     */


    public static void main(String[] args) {
//        Main main = new Main();
//        main.run();

        new Main().run();

    }

    public void run() {

        calculate(5, n -> n*n);
        calculate(5, n -> n+1);
        calculate(5, n -> n*2);
        calculate(5, n -> 0);
    }

    public void calculate(int inputInt, UnaryOperator<Integer> unaryOperator) {
        int results = unaryOperator.apply(inputInt);
        System.out.println(results);

    }

}
