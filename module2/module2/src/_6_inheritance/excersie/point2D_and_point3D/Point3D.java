package _6_inheritance.excersie.point2D_and_point3D;

import java.util.Arrays;

public class Point3D extends Point2D {
   private float z = 0.0f;
    public Point3D() {

    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXyz(float x, float y, float z) {
        this.z = z;
    }

    public float[] getXyz() {
        float[] xyz = {getX(), getY(), z};
        return xyz;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                ", x=" + getX() +
                ", y=" + getY() +
                '}';
    }

    public static void main(String[] args) {
        Point3D point3D = new Point3D(10); // kế thừa x y từ 2d
        System.out.println(point3D.toString());
        point3D = new Point3D(10, 10, 10); // thay đổi xyz
        System.out.println(point3D.toString());
        point3D.setX(2); // thay đổi x = 2
        System.out.println(point3D.getX()); // get giá trị x
        System.out.println(point3D.toString()); // hiện trị x sau khi set
        point3D.setXyz(1,2,3);
        point3D.getXyz();
    }
}