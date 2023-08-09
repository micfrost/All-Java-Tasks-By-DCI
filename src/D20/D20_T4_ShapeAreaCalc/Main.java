package D20.D20_T4_ShapeAreaCalc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the radius of the circle: ");
        double givenRadius = Double.parseDouble(scanner.nextLine());

        System.out.println("Type the length of the rectangle: ");
        double givenLength = Double.parseDouble(scanner.nextLine());
        System.out.println("Type the width of the rectangle: ");
        double givenWidth = Double.parseDouble(scanner.nextLine());

        System.out.println("Type the base of the triangle: ");
        double givenBase = Double.parseDouble(scanner.nextLine());
        System.out.println("Type the height of the triangle: ");
        double givenHeight = Double.parseDouble(scanner.nextLine());

        boolean isTriangle;
        if (givenBase > 0) {
            isTriangle = true;
        } else {
            isTriangle = false;
        }

        ShapeAreaCalculator shapeArea = new ShapeAreaCalculator();

        double areaCircle = shapeArea.calculateArea(givenRadius);
        System.out.println("The area of the circle is: " + areaCircle);

        double areaRectangle = shapeArea.calculateArea(givenLength, givenWidth);
        System.out.println("The area of the rectangle is: " + areaRectangle);

        double areaTriangle = shapeArea.calculateArea(isTriangle, givenBase, givenHeight);
        System.out.println("The area of the triangle is: " + areaTriangle);

    }
}
