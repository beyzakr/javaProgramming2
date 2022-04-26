package day43_Abstraction.shapeTask;

public final class Rectangle extends Shape{

    private double length;
    private double width;

    public Rectangle( double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length <=0 ){
            throw new RuntimeException("Invalid length number: "+length);
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <= 0){
            throw new RuntimeException("Invalid width number: "+width);
        }
        this.width = width;
    }

    public double area(){
        return width * length;
    }
    public double perimeter(){
        return 2 * (width + length);
    }


}
/*
Rectangle:
        area(): w * l
        perimeter(): 2 * (w+l)
*/