package D20_Methods.D20_T2_MethodParameters;

public class MethodParameters {
    double average(double value1, double value2, double value3 ) {
        double result = (value1+value2+value3)/3;
        System.out.println("Provided values: " + value1 + ", " + value2 + ", " + value3 );
        System.out.print("The Average: ");
        return result;
    }
}
