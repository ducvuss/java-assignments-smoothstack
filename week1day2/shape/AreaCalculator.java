package shape;

public class AreaCalculator {
    public static void main(final String[] args) {
        final Triangle triangle = new Triangle(2, 3);
        triangle.calculateArea();
        triangle.display();
        
        final Rectangle rectangle = new Rectangle(2, 3);
        rectangle.calculateArea();
        rectangle.display();
        
        final Circle circle = new Circle(3);
        circle.calculateArea();
        circle.display();
    }
}