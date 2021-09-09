package _6_inheritance.excersie.Point2D_and_Point3D;

public class Point2D {
   float x = 1f;
   float y = 2f;

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] xy = {x, y};
        return xy;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static void main(String[] args) {
        Point2D point2D = new Point2D(10, 5);
        System.out.println(point2D.toString());
        point2D.setXY(20, 10);
        System.out.println(point2D.toString());
        System.out.println(point2D.getXY());
        }
}
