package Rectangle;

public class ChuNhat {
    double width;
    double height;

    public ChuNhat() {}

    public ChuNhat(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double getArea() {
        return this.width * this.height;
    }

    double getPerimeter() {
        return 2 * (this.width * this.height);
    }

    String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }
}
