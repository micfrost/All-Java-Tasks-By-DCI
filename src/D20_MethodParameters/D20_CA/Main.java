package D20_MethodParameters.D20_CA;

public class Main {
    public static void main(String[] args) {

        Calculator calcMy = new Calculator();
        int squared = calcMy.square(8);
        System.out.println(squared);

        int added = calcMy.add(7, 5);
        System.out.println(added);
    }
}
