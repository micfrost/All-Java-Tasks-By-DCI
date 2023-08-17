package D24_logicalOperators.D24_CA_OR;

public class Main {
    public static void main(String[] args) {

        boolean isRaining = false;
        boolean mightRain = false;

        boolean takeUmbrella = false;

        if (isRaining || mightRain) {
            takeUmbrella = true;
            System.out.println("take Umbrella: " + takeUmbrella);
        }


        takeUmbrella = isRaining || mightRain;
        System.out.println("one more tame take Umbrella: " + takeUmbrella);



        boolean haveUmbrella = false;

        if ((isRaining || mightRain) && haveUmbrella) {
            System.out.println("Take an umbrella.");

        } else {
            System.out.println("Don't take umbrella.");
        }

    }
}
