package D24_logicalOperators.D24_CA_Ternary;

public class Main {
    public static void main(String[] args) {

        boolean isRaining = true;
        boolean mightRain = true;


        boolean haveUmbrella = true;

        boolean takeUmbrella  = false;

        takeUmbrella = isRaining && haveUmbrella ? true : false;
        System.out.println("take an Umbrella : " + takeUmbrella);

    }
}
