package D36_AbstractClasses.D36_CA3_Abstract_Shape;

public class Main {
    public static void main(String[] args) {
        Shape shapeMyRectangle = new Rectangle();
        System.out.println();
        shapeMyRectangle.shape();
        shapeMyRectangle.draw();

        Shape shapeMyCircle = new Circle();
        System.out.println();
        shapeMyCircle.shape();
        shapeMyCircle.draw();
    }


}


