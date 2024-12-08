package Point1;

public class MoveablePoint extends Point {
    private float xSeep = 0.0f;
    private float ySeep = 0.0f;

    public MoveablePoint() {}
    public MoveablePoint(float x, float y, float xSeep, float ySeep) {
        super(x, y);
        this.xSeep = xSeep;
        this.ySeep = ySeep;
    }

    public float getxSeep() {
        return xSeep;
    }

    public void setxSeep(float xSeep) {
        this.xSeep = xSeep;
    }

    public float getySeep() {
        return ySeep;
    }

    public void setySeep(float ySeep) {
        this.ySeep = ySeep;
    }

    public float[] getSeep() {
        return new float[]{xSeep, ySeep};
    }

    public void setSeep(float xSeep, float ySeep) {
        this.xSeep = xSeep;
        this.ySeep = ySeep;
    }

    @Override
    public String toString() {
        return "(x,y)" + getX() + "," + getY() + "," + "speed = (xs, ys) " + getxSeep() + "," + getxSeep() + getySeep();

    }

    public MoveablePoint move() {
        this.setX(this.getX() + this.getxSeep());
        this.setY(this.getY() + this.getySeep());
        return this;
    }
}
