public class D16_T2_ifElse {
    public static void main(String[] args) {
        int receivedNumber = Integer.parseInt(args[0]);

        if (receivedNumber >= 0) {
            System.out.println("The number is positive");
        } else {
            System.out.println("The number is negative");
        }
    }
}
