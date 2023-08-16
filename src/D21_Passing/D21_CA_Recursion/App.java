package D21_Passing.D21_CA_Recursion;

public class App {
    public static void main(String[] args) {

//        4! = 4*3*2*1

        System.out.println(factorial(6));

    }

    public static int factorial(int value) {
        System.out.println(value);

        if (value == 1) {
            return 1;
        }

        return factorial(value -1) * value;

    }

}
