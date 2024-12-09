package Inheritance.square;

import Inheritance.rectangle.Rectangle;
import Inheritance.resizeable.Resizeable;

public class Square extends Rectangle implements Resizeable {
    private double side;

    public Square() {}

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
    }

    @Override
    public void setWidth(double width) {
        setWidth(width);
    }

    @Override
    public void setLength(double length) {
        setLength(length);
    }

    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                +super.toString();
    }

    public void resize(double percent) {
        this.side += this.side * percent / 100;
    }
}

