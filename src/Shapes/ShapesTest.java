package Shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(4,5);
        double perimeter = box1.getPerimeter();
        double area = box1.getArea();
        System.out.printf("perimeter: %f area: %f\n", perimeter, area);

        Rectangle box2 = new Square(5);
        double squarePerimeter = box2.getPerimeter();
        double squareArea = box2.getArea();
        System.out.printf("perimeter: %f area: %f", squarePerimeter, squareArea);
    }
}
