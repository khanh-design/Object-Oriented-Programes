package Inheritance.resizeable;

import Inheritance.circle.Circle;
import Inheritance.rectangle.Rectangle;
import Inheritance.square.Square;

public class ResizeableTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(5.0, 5.0);
        Square square = new Square(6.0);


        System.out.println("Initial sizes: ");
        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);

        circle.resize(20.0);
        rectangle.resize(30.0);
        square.resize(50.0);

        System.out.println("After resize: ");
        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);
    }
}
