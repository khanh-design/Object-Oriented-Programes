package Circle_Cylinder;


public class Cylinder extends Circle12 {
    private double height;

    public Cylinder() {}
    public Cylinder(double radius, String color, double height) {
        super (radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return 2 * Math.PI * height * getRadius();
    }

    @Override
    public String toString() {
        return "A Cylinder width height: " + getHeight() + " and color: " + getColor()
                + " and Area: " + getArea();
    }
}
