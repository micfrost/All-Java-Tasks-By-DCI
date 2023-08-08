package D20_MethodParameters.D20_CA;

public class Calculator {
    int square(int value) {
        System.out.println("Received the value: " + value);
        return value*value;
    }
int add(int a, int b) {
    System.out.println("Received values: " + a + " and " + b);
    return a + b;
}
}
