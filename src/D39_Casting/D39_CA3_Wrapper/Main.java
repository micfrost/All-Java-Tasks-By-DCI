package D39_Casting.D39_CA3_Wrapper;

public class Main {
    public static void main(String[] args) {
        System.out.println("- - -");
        System.out.println("Boxing int to Integer - 3 Ways");
        int numberint = 40;
        Integer numberInteger1 = new Integer(numberint);
        System.out.println(numberInteger1);
        Integer numberInteger2 = numberint;
        System.out.println(numberInteger2);
        Integer numberInteger3 = 40;
        System.out.println(numberInteger3);

        System.out.println("- - -");
        System.out.println("Unboxing");
        Integer valueInteger = 600;
        int n = valueInteger;
        System.out.println(n);
    }

}


