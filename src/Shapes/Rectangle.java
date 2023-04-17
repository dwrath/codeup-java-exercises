package Shapes;

public class Rectangle {
    protected double length;
    protected double width;

    public Rectangle (double width, double length){
        this.width = width;
        this.length = length;
    }

    public double getArea(){
        return width * length;
    }
    public double getPerimeter(){
        return 2*length + 2*width;
    }
}
