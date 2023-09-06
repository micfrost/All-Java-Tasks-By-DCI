package D35_AccesModifiers.D35_T1_ShapeHierarchy;

public class Circle extends Shape {

    private double radius;

    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
