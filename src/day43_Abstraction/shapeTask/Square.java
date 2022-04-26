package day43_Abstraction.shapeTask;

public final class Square extends Shape{

    private double side;

    public Square( double side) {
        super("Square");
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side <=0 ){
            throw new RuntimeException("Invalid side number: "+side);
        }
        this.side = side;
    }

    public double area(){
        return side * side;
    }

    public double perimeter(){
        return 4 * side;
    }
}
/*
Square:
					area(): s * s
					perimeter: 4 * s
 */