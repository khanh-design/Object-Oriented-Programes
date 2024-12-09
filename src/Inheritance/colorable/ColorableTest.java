package Inheritance.colorable;

import Inheritance.square.Square;

public class ColorableTest {
    public static void main(String[] args) {
        Square12 square = new Square12(20.0);

        System.out.println("Initial sizes: ");
        System.out.println(square);
        System.out.println(square.getArea());

        System.out.println("After-coted: ");
        System.out.println(square.howtoColor());


    }
}
