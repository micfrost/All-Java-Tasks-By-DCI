package D35_AccesModifiers.D35_T1_ShapeHierarchy;

public class Rectangle extends Shape {

    private double width;
    private double height;

    public double calculateArea() {
        return width * height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }


}
