package Inheritance.camparable;


import Inheritance.cricle.circle;
import org.jetbrains.annotations.NotNull;

public class ComparableCricle extends circle
        implements Comparable<ComparableCricle>{
    public ComparableCricle() {}

    public ComparableCricle(double radius) {
        super(radius);
    }

    public ComparableCricle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public int compareTo(ComparableCricle o) {
        if (getRadius() > o.getRadius()) return 1;
        if (getRadius() < o.getRadius()) return -1;
        else return 0;
    }
}
