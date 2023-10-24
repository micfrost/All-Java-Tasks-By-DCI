package D41_UpcastingDown.D41_T2_ShapeHierarchy;

public class Main {

    public static void main(String[] args) {

        System.out.println("- - -");
        System.out.println("Upcasting and Downcasting - Shape Hierarchy");
        System.out.println("DC_T_1_ReantrantLock_Inside Java program that demonstrates upcasting (assigning a subclass object to a superclass reference) and downcasting (casting a superclass reference to a subclass reference) by modeling a hierarchy of geometric shapes. ");
        System.out.println("- - - ");

        Shape shape1 = new Circle("Red", 5);
        Shape shape2 = new Rectangle("Blue", 5.1, 5.2);
        Shape shape3 = new Triangle("Green", 5.1, 5.2);

        shape1.calculateArea();
        shape2.calculateArea();
        shape3.calculateArea();

//        Downcasting to access the specific attributes and behaviors
        System.out.println("- - - ");
        if (shape1 instanceof Circle) {
            Circle circle1 = (Circle) shape1;
            System.out.println("The Radius: " + circle1.getRadius());
        }

        if (shape2 instanceof Rectangle) {
            Rectangle rectangle1 = (Rectangle) shape2;
            System.out.println("The Width: " + rectangle1.getWidth());
            System.out.println("The Height: " + rectangle1.getHeight());
        }

        if (shape3 instanceof Triangle) {
            Triangle triangle1 = (Triangle) shape3;
            System.out.println("The Base: " + triangle1.getBase());
            System.out.println("The Height: " + triangle1.getBaseHeight());
        }


    }
}

