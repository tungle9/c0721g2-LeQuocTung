package _05_modifier_static_method_static.excersie;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    private double area =  10 ;
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return area;

    }

    void display() {
        System.out.println("radius:" + radius + ",color :" + color+ ",Area : " +area);
    }
}
