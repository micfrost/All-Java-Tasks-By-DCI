public class D17_T2_Ternary {
    public static void main(String[] args) {
        int givenNumber = Integer.parseInt(args[0]);

        String valuetoPrint = (givenNumber % 2 == 1 && givenNumber > 0)
                ? "positive and odd"
                : "not positivie and odd";
        System.out.println(givenNumber + " is " + valuetoPrint);
    }
}
