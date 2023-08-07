package D18;

public class D16_T3_ifelseif_ladder {
    public static void main(String[] args) {
        int value1 = Integer.parseInt(args[0]);
        int value2 = Integer.parseInt(args[1]);

        if (value1>value2) {
            System.out.println(value1 + " is grater that " + value2);
        }
        if (value1<value2) {
            System.out.println(value2 + " is grater that " + value1);
        } else {
            System.out.println("Both values are equals");
        }
    }

}
