package _07_abstract_class_and_interface.excersice.resizeable;


public class Circlee extends Shapee implements Resizeable {
    private double radius = 1.0;

    public Circlee() {
    }

    public Circlee(double radius) {
        this.radius = radius;
    }

    public Circlee(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public double resize(double percent) {
        double a = getArea() * percent + getArea();
        return a;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }
}

