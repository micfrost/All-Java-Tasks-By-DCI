package D39_Casting.D39_T1_NumericOperations;

import java.math.BigDecimal;

public class NumericOperations {
    public static void main(String[] args) {

        //        Addition
        System.out.println("- - -");
        System.out.println("Addition of an int and a double: ");
        int int1 = 1;
        double double1 = 1.1;
        System.out.println(int1 + " + " + double1 + " = " + (int1 + double1));

        //        Subtraction
        System.out.println("- - -");
        System.out.println("Subtraction of a float from an int: ");

        float float1 = 3.3f;
        int int2 = 4;
        System.out.print(int2 + " - " + float1 + " = " + (int2 - float1));
        System.out.println(" (Using float and int)");

        float float2 = int2;
        System.out.print(float2 + " - " + float1 + " = " + (float2 - float1));
        float float3 = float2 - float1;
        System.out.println(" (Using casting)");

        System.out.println("- - -");
        System.out.println("Subtraction of two Double values (Objects) ");
        Double double2 = 4.00;
        Double double3 = 3.30;
        System.out.println(double2 + " - " + double3 + " = " + (double2 - double3));

        System.out.println("- - -");
        System.out.println("Subtraction of two just hardcoded numbers ");

        System.out.println("4.0 - 3.3 = " + (4.0 - 3.3));

        System.out.println();
        System.out.println("Subtraction of two BigDecimal values");
        BigDecimal decimal2 = new BigDecimal("4.00");
        BigDecimal decimal3 = new BigDecimal("3.30");
        BigDecimal result = decimal2.subtract(decimal3);
        System.out.println(decimal2 + " - " + decimal3 + " = " + result);


        //        Multiplication
        System.out.println("- - -");
        System.out.println("Multiplication of a short and a long: ");
        short short1 = 5;
        long long1 = 60L;
        System.out.println(short1 + " * " + long1 + " = " + (short1 * long1));


        //        Division
        System.out.println("- - -");
        System.out.println("Division of two double values: ");
        double double4 = 7.00;
        double double5 = 8.00;
        System.out.println(double4 + " / " + double5 + " = " + (double4 / double5));



    }
}
