package _6_inheritance.excersie.Circle_and_Cylinder;

public class Circle {
    String color ;
    double radius ;
    public Circle(){

    }
    public Circle(String color, double radius) {
        this.color = color;
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
     void alo(){
        System.out.println("abc");
    }


    @Override
    public String toString() {
        return "Circle{" +
                "color='" + color + '\'' +
                ", radius=" + radius +
                '}';
    }

    public static void main(String[] args) {
        Circle circle = new Circle("Red",12);
        System.out.println(circle.toString());
    }
}
