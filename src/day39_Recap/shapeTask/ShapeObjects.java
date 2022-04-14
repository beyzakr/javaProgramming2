package day39_Recap.shapeTask;

import org.w3c.dom.css.Rect;

public class ShapeObjects {
    public static void main(String[] args) {

        Square square = new Square(10);

        // square.side = -1000000;

        System.out.println(square);

        square.setSide(15);

        System.out.println(square);

        System.out.println("--------------");

        Rectangle rectangle=new Rectangle(5,6);
        System.out.println(rectangle);
        rectangle.setLength(10);
        System.out.println(rectangle.getLength());

        System.out.println("-------------");

        Circle circle = new Circle(7.5);
        System.out.println(circle);

        System.out.println(circle.getName());





    }
}
