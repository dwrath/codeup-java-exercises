package Shapes;

public class Rectangle extends Quadrilateral implements Measurable{
    protected double length;
    protected double width;

    public Rectangle(double length, double width) {
        super(length, width);
    }


    @Override
    public double getPerimeter() {
        return length * width;
    }

    @Override
    public double getArea() {
        return 2 * length + 2 * width;
    }

    @Override
    void setLength(double length) {

    }

    @Override
    void setWidth(double width) {

    }
}
