package _6_inheritance.excersie.circle_and_cylinder;

public class Circle {
   private  String color = "black";
   private  double radius;
   private double area ;

    public Circle() {

    }
    public double getArea(){
        return area;
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
        this.area = Math.PI*this.radius*this.radius;
    }


    @Override
    public String toString() {
        return "Circle{" +
                "color='" + color + '\'' +
                ", radius=" + radius +
                ",area= "+area+
                '}';
    }

    public static void main(String[] args) {
        Circle circle = new Circle("Red", 12);
        System.out.println(circle.toString());
    }
}
