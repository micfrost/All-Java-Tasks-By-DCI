package D63_64_Functional_Programming.DC_CA_3_Lambda;

@FunctionalInterface
interface Runner {
    void execute();
}

interface Greet{
    void greeting();
}

public class Main implements Greet {

    @Override
    public void greeting() {
        System.out.println("Hello from greeting");
    }


    public static void main(String[] args) {

        Runner runner = () -> {
            System.out.println("Hello from runner");
        };

        System.out.println("- - - - - - ");
        runner.execute();
        System.out.println("Is instance of Runner? : " + (runner instanceof Runner));
        System.out.println(runner.getClass());



        System.out.println("- - - - - - ");

        // Create an instance of the Main class
        Main mainInstance = new Main();
        // Call the greeting method
        mainInstance.greeting();

    }
}
