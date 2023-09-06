package D35_AccesModifiers.D35_T1_ShapeHierarchy;

public class Main {
    public static void main(String[] args) {

        Circle circleTheBigOne = new Circle();
        circleTheBigOne.setColor("white");
        circleTheBigOne.setRadius(150.5);

        System.out.println();
        System.out.println("Shape: " +  circleTheBigOne.getClass().getSimpleName());
        System.out.printf("The Color of a circle is: %s\n", circleTheBigOne.getColor());
        System.out.printf("Area of a circle with a radius %.2f is: %.2f.\n",
                circleTheBigOne.getRadius(),
                circleTheBigOne.calculateArea());


        Rectangle rectangleTheBigOne = new Rectangle();
        rectangleTheBigOne.setColor("blue");
        rectangleTheBigOne.setWidth(75.4);
        rectangleTheBigOne.setHeight(105.4);

        System.out.println();
        System.out.println("Shape: " +  rectangleTheBigOne.getClass().getSimpleName());
        System.out.printf("The Color of a rectangular is: %s.\n", rectangleTheBigOne.getColor());
        System.out.printf("Area of a rectangle with a width %.2f and a height %.2f is: %.2f.\n",
                rectangleTheBigOne.getWidth(),
                rectangleTheBigOne.getHeight(),
                rectangleTheBigOne.calculateArea());
    }
}
