package D39_Casting.D39_T3_Unboxing;

public class IntegerOperations {
    public static void main(String[] args) {

        System.out.println("A program that performs integer operations using both primitive and wrapper classes.");
        System.out.println("- - - ");
        int int1 = 20;
        int int2 = 15;
        System.out.println("Number1 : " + int1);
        System.out.println("Number2 : " + int2);
        System.out.println();

        System.out.println("Add two integers using primitive data types.");
        int intAddition = int1 + int2;
        System.out.println(intAddition);
        System.out.println();

        System.out.println("Subtract two integers using wrapper classes (autoboxing).");
        Integer integer1 = int1;
        Integer integer2 = int2;
        Integer IntegerSubtract = integer1 - integer2;
        System.out.println(IntegerSubtract);
        System.out.println();

        System.out.println("Add two integers using primitive data types.");
        int intMultiply = int1 * int2;
        System.out.println(intMultiply);
        System.out.println();

        System.out.println("Divide two integers using wrapper classes (unboxing).");
        Integer integer3=100;
        Integer integer4=50;
        double int5 = integer3;
        double int6 = integer4;
        double intDivide = int5 /int6;
        System.out.println(intDivide);
        System.out.println();


    }
}
