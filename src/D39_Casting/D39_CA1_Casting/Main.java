package D39_Casting.D39_CA1_Casting;

public class Main {

    public static void main(String[] args) {
        System.out.println("- - -");
        System.out.print("Just Long: ");
        long long1 = 9223372036854775807L;
        System.out.println(long1);

        //            Widening Casting
        System.out.println("- - -");
        System.out.println("Widening");
        System.out.print("Float from this long: ");
        float float1 = long1;
        System.out.println(float1);

        //            Widening Casting

        System.out.print("Double from this long: ");
        double double1 = long1;
        System.out.println(double1);

        //           Mathematical
        System.out.println("- - -");
        System.out.println("Mathematical float in decimal");

        System.out.println("9223372000000000000");


    }


}

