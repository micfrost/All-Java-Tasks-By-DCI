package D24_logicalOperators.D24_CA_AND;

public class App {
    public static void main(String[] args) {

//        Boolean logical operators AND &&
//        Those are also called short-circuit operators

        logicalOperatorAND();
//        nestedIF();

    }

    public static void logicalOperatorAND() {
        System.out.println("--- Logical Operator AND && ---");
        boolean isRaining = true;
        boolean haveUmbrella = true;
        boolean takeUmbrella = false;

        if (isRaining && haveUmbrella) {
            takeUmbrella = true;
            System.out.println("Take umbrella: " + takeUmbrella);
        }
    }

    public static void nestedIF() {
        boolean isRaining = true;
        boolean haveUmbrella = false;
        boolean takeUmbrella;

        if (isRaining) {
            if (haveUmbrella) {
                takeUmbrella = true;
                System.out.println("I am taking an umbrella.");
            } else {
                takeUmbrella = false;
                System.out.println("I am not taking an umbrella.");
            }
        } else {
            takeUmbrella = false;
            System.out.println("I am not taking an umbrella.");
        }
    }

}
