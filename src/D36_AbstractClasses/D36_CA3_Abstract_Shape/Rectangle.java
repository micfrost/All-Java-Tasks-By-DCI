package D36_AbstractClasses.D36_CA3_Abstract_Shape;

public class Rectangle extends Shape {
    @Override
    void shape() {
        System.out.println("Rectangle shape.");
    }

    @Override
   public void draw() {
        super.draw();
        System.out.println(".. a rectangle.");
    }
}
