package D38_Polymorphism.D38_CA4_Overloading_Poly;


class Calculate{

//    Overloading
//    static make it simpler for Java
    static int Multiply(int a, int b) {
        return a*b;
    }

    static double Multiply(double a, double b) {
        return a*b;
    }

}

public class Main {
    public static void main(String[] args) {
        System.out.println("OVERLOADING");
        System.out.println(Calculate.Multiply(4,5));
        System.out.println(Calculate.Multiply(4.5,5.5));

    }
}
