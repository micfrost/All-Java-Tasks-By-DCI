package D24_logicalOperators.D24_CA_OR;

public class Main {
    public static void main(String[] args) {


        boolean isRaining = true;
        boolean mightRain = true;

        boolean takeUmbrella  = false;

        if(isRaining || mightRain) {
            takeUmbrella = true;
            System.out.println("take Umbrella: " + takeUmbrella);
        }

        takeUmbrella = isRaining || mightRain;

        System.out.println("one more tame take Umbrella: " + takeUmbrella);


    }
}
