package D20_Methods.D20_T4_ShapeAreaCalc;

public class ShapeAreaCalculator {

    double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    double calculateArea(double length, double width) {
        return length * width;
    }

    double calculateArea(boolean isTriangle, double base, double height) {
        double result;
        if (isTriangle == true) {
            result = 0.5 * base * height;
        } else {
            result = 0;
        }
        return result;
    }

}
