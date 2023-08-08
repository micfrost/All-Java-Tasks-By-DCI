package D20.D20_T3_AreaOfRectangle;

public class RectangleCalculator {

double areaOfRectangle(double length, double width) {
    double result = length*width;
    System.out.print("The area of the rectangle is: ");
    return result;
}

    double perimeterOfRectangle(double length, double width) {
        double result = 2*(length+width);
        System.out.print("The perimeter of the rectangle is: ");
        return result;
    }

}
