package D41_UpcastingDown.D41_T2_ShapeHierarchy;
abstract class Shape {
    private String color;
    public Shape(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    abstract void calculateArea();
}

class Circle extends Shape{
    private double radius;
    public double getRadius() {
        return radius;
    }
    public Circle(String color, double radius) {
       super(color);
        this.radius = radius;
    }
    @Override
    void calculateArea() {
        System.out.printf("The area of a %s circle with a radius %.2f is: %.2f\n" ,getColor(), radius, (Math.PI*radius*radius));
    }
}

class Rectangle extends Shape{
    private double width;
    private double height;
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }
    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }
    @Override
    void calculateArea() {
        System.out.println("The are of a " +getColor() + " rectangle with a width " + width + " and height " + height + " is: " + (width*height));
    }
}
class Triangle extends Shape{
    private double base;
    private double baseHeight;
    public double getBase() {
        return base;
    }

    public double getBaseHeight() {
        return baseHeight;
    }

    public Triangle(String color, double base, double baseHeight) {
        super(color);
        this.base = base;
        this.baseHeight = baseHeight;
    }

    @Override
    void calculateArea() {

            System.out.println("The are of a " +getColor() + " triangle with a base" + base + " and Height " + baseHeight + " is: " + 0.5*(base*baseHeight));

    }
}
