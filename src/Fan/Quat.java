package Fan;

public class Quat {
    public static final int  Slow = 1;
    public static final int Medium = 2;
    public static final int Fast = 3;

    private int Speed;
    private boolean On;
    private double radius;
    private String color;

    public Quat() {
        this.Speed = Slow;
        this.On = false;
        this.radius = 5.0;
        this.color = "black";
    }

    public int getSpeed() {
        return Speed;
    }

    public void setSpeed(int speed) {
        Speed = speed;
    }

    public boolean isOn() {
        return On;
    }

    public void setOn(boolean on) {
        On = on;
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

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (isOn()){
            return "Seep: " + Speed + ", On: " + On + ", Radius: " + radius + ", Color: " + color + "fan is on";
        } else {
            return "Speed: " + Speed + ", On: " + On + ", Radius: " + radius + ", Color: " + color + "fan is off";
        }
    }

}
