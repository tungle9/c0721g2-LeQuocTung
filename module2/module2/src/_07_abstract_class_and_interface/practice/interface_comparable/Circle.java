package _07_abstract_class_and_interface.practice.interface_comparable;

public class Circle {
    private double radius = 5.0;
    private String color = "red";
    private boolean filled ;
    private double area ;

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }
    public double getRadius() {
        return radius*radius;
    }

    public double getArea() {
        return this.area = Math.PI*radius*radius;

    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                ", area=" + area +
                '}';
    }

    public void display() {
        System.out.println("radius:" + radius + ",color :" + color+ ",Area : " +getArea());
    }
}
