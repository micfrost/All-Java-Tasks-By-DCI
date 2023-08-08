package D20.D20_T1;

public class Main {
    public static void main(String[] args) {

        ArithmeticCalculator arithOper = new ArithmeticCalculator();

        double add1 = arithOper.addition(4, 5);
        System.out.println(add1);

        double sub1 = arithOper.subtraction(8, 10);
        System.out.println(sub1);

        double mult1 = arithOper.multiplication(12, 15);
        System.out.println(mult1);

        double divi1 = arithOper.division(16, 20);
        System.out.println(divi1);




    }
}
