package Fan;

public class Main {
    public static void main(String[] args) {
        Quat quat1 = new Quat();
        quat1.setSpeed(Quat.Fast);
        quat1.setRadius(10);
        quat1.setColor("Color");
        quat1.setOn(true);

        Quat quat2 = new Quat();
        quat2.setSpeed(Quat.Medium);
        quat2.setRadius(5);
        quat2.setColor("blue");
        quat2.setOn(false);

        System.out.println(quat1);
        System.out.println(quat2);
    }
}
