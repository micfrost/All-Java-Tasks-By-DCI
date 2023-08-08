package D20.D20_T4_ShapeAreaCalc;

public class ShapeAreaCalculator {

    double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    double calculateArea(float length, float width) {
        return length * width;
    }

    double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }

}
