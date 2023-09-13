package D38_Polymorphism.D38_T1_GeometricShapes;


class Circle {

    static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
}

class Rectangle {
    static double calculateArea(double width, double height) {
        return width * height;
    }
}

class Triangle {
    static double calculateArea(double base, double height) {
        return (base * height) / 2;
    }
}

public class ShapeCalculator {

    public static void main(String[] args) {

//        creating array of objects. Every object extents Object class
        Object[] shapes = new Object[3];

//        creating instances
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Triangle();

//        printing
        System.out.println("Geometric Shapes");
        for (Object element : shapes) {
            if (element instanceof Circle) {
                System.out.printf("Area of a %s: %.2f\n",element.getClass().getSimpleName() ,Circle.calculateArea(4.5));
            }
            if (element instanceof Rectangle) {
                System.out.printf("Area of a %s: %.2f\n",element.getClass().getSimpleName(), Rectangle.calculateArea(5.1, 6.2));
            }
            if (element instanceof Triangle) {
                System.out.printf("Area of a %s: %.2f\n",element.getClass().getSimpleName(), Triangle.calculateArea(5.1, 6.2));
            }
        }

    }
}
