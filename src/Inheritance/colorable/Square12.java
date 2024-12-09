package Inheritance.colorable;

import Inheritance.rectangle.Rectangle;
import Inheritance.square.Square;

public class Square12 extends Rectangle implements Colorable{
    @Override
    public String howtoColor() {
        return "pink";
    }

    private double ride;
    public Square12() {}

    public Square12(double side) {
        super(side, side);
    }

    public double getRide() {
        return ride;
    }

    public void setRide(double ride) {
        this.ride = ride;
    }

    public double getArea() {
        return super.getArea();
    }

    @Override
    public String toString() {
        return "A square with side: " + getRide()
                + " and area: " + getArea();
    }
}
