package D36_AbstractClasses.D36_CA3_Abstract_Shape;

public class Circle extends Shape {


    @Override
    void shape() {
        System.out.println("Circle shape.");
    }
    public void draw() {
        super.draw();
        System.out.println(".. a circle.");
    }

}
