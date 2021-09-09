package _6_inheritance.excersie.Point_and_MoveablePoint;

public class Point {
   private float x = 1f;
    private float y = 2f;
        public Point() {
    }
    public Point(float x, float y) {
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

    public void SetXY(float x, float y) {
        this.x = x ;
        this.y = y ;
    }
    public float[] getXY(){
        float []XY = {x,y};
        return XY;
    }
    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static void main(String[] args) {
       Point point = new Point();
//        System.out.println(point.x);
        System.out.println(point.toString());
    }
}
