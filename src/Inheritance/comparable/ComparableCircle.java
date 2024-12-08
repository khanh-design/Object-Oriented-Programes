package Inheritance.comparable;

import Inheritance.circle.Circle;
import org.jetbrains.annotations.NotNull;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle>{
    public ComparableCircle() {}

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public int compareTo(@NotNull ComparableCircle o) {
        if (o.getRadius() > o.getRadius()) return 1;
        if (o.getRadius() < this.getRadius()) return -1;
        else return 0;
    }
}
