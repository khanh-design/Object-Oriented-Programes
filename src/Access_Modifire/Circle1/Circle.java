package Access_Modifire.Circle1;

public class Circle {
    private double radius = 1;
    public String color = "red";

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle();

        circle.setColor("blue");
        System.out.println("Ban kinh: " + circle.getRadius() + " and color = " + circle.getColor());
    }
}
