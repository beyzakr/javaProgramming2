package day43_Abstraction.shapeTask;

public final class Circle extends Shape{

    public double radius;
    public static double pi =3.14;

    public Circle(double radius) {
        super("Circle");
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <=0 ){
           throw new RuntimeException("Invalid number: "+radius);
        }
        this.radius = radius;
    }


    public double area(){
        return radius * radius *pi;
    }

    public double perimeter(){
        return 2 * radius *pi;
    }

}
