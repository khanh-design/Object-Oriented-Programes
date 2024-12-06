package Inheritance;

public class Rectangle extends Shape{
    private double width = 5;
    private double height = 5;

    public Rectangle() {}
    public Rectangle(double width, double height, String color, boolean filled) {
        super (color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return (width + height) / 2;
    }

    @Override
    public String toString() {
        return "A rectangle width: " + getWidth() + " heght: " + getHeight()
                + "\n"+ "and area " + getArea() + "\n" + " perimeter " + getPerimeter();
    }

}
