package Circle_Cylinder;

public class Circle12 {
    private double radius;
    private String color;

    public Circle12() {}
    //contructor
    public Circle12(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    //Tinh area
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "A circle12 width radius: " + getRadius()
                + " color: " + getColor() + " area: " + getArea();
    }
}
