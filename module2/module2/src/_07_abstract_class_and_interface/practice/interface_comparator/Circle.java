package _07_abstract_class_and_interface.practice.interface_comparator;
import _06_inheritance.practice.Shape;
public class Circle extends Shape   {
    private double radius = 1;
    public Circle(double radius){
        this.radius = radius ;
    }
    public Circle(){

    }
    public Circle(double radius, String color , boolean filled){
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getPer(){
        return 2*radius*Math.PI;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    @Override
    public String toString() {


        return "Circle{" +
                "radius=" + radius +
                ", color='" + getColor() + '\'' +
                ", filled=" + isFilled() +
                '}';
    }

    public static void main(String[] args) {
        Circle circle = new Circle(3.5);
        System.out.println(circle);
        circle = new Circle(34,"black",true);
        System.out.println(circle);
    }
}
