package D18;

public class D16_CodeAlong_If {
    public static void main(String[] args) {
        int covidCases = 50;
        boolean ishomeinconstrction = true;
        if (covidCases >= 45) {
            System.out.println("I am going home.");
//Nested if
            if (ishomeinconstrction) {
                System.out.println("oh no the home it is construction");
            }
        } else {
            System.out.println("I am going to college.");
        }
        System.out.println("Nice talking with you.");
    }
}
