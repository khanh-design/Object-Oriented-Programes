package Inheritance.Point1;

public class MovaablePointTest {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint(1.0f, 2.0f, 0.5f, 0.5f);
        System.out.println(moveablePoint);

        moveablePoint.move();
        System.out.println(moveablePoint);
    }
}
