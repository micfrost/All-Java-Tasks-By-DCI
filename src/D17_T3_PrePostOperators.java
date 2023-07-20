public class D17_T3_PrePostOperators {
    public static void main(String[] args) {
        int operator = Integer.parseInt(args[0]);
        int value = Integer.parseInt(args[1]);

        System.out.println(" Operator is " + operator + " and value is " + value);
        if (operator%3 == 0 || operator%5 == 0) {
            int result35 = ++value * 10;

            System.out.println("Value was pre incremented and now has a value of " + value + ". The operation was done before incrementation, so the result is " + result35);
        } else {
            int resultN35 = value++ * 100;
            System.out.println("Value was post incremented and now has a value of " + value + ". The operation was done after incrementation, so the result is " + resultN35);
        }

    }
}
