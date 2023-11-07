package D63_64_Functional_Programming.DC_CA_2_Functional_Interface;

// has only one method
@FunctionalInterface
interface Runner {
    void execute();
}

public class Main {
    public static void main(String[] args) {

//        Lambda without a parameter
//        Using Lambda implementation is equivalent to overriding the execute method
        Runner runner = () -> {
            System.out.println("Hello");
        };

        runner.execute();

        System.out.println(runner instanceof Runner);
        System.out.println(runner.getClass());
    }
}
