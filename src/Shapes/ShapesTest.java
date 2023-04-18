package Shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(4, 5);
        double perimeter = box1.getPerimeter();
        double area = box1.getArea();
        System.out.printf("perimeter: %f area: %f\n", perimeter, area);

        Quadrilateral box2 = new Square(5);
        double squarePerimeter = box2.getPerimeter();
        double squareArea = box2.getArea();
        System.out.printf("perimeter: %f area: %f\n", squarePerimeter, squareArea);

        Measurable myShape = new Square(5);
        double p = myShape.getPerimeter();
        double a = myShape.getArea();
        System.out.printf("perimeter: %f area: %f\n", p , a);

        Measurable myShape1 = new Rectangle(4,5);
        double p1 = myShape1.getPerimeter();
        double a1 = myShape1.getArea();
        System.out.printf("perimeter: %f area: %f", p1, a1);
    }
}
