package Shapes;

public class Rectangle {
    protected double length;
    protected double width;

    public Rectangle (double width, double length){
        this.width = width;
        this.length = length;
    }

    public double getArea(){
        double area = width * length;
        return area;
    }
    public double getPerimeter(){
        double perimeter = 2*length + 2*width;
        return perimeter;
    }
}
