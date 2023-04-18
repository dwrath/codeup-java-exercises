package Shapes;

public class Square extends Quadrilateral {
    private final double side;

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }

    @Override
    void setLength(double length) {

    }

    @Override
    void setWidth(double width) {

    }
}
