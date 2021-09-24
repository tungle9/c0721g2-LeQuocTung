package _07_abstract_class_and_interface.excersice.colorable;

public class Rectanglee extends Shapee  {
//    @Override
//    public String howtoColor() {
//        return "Color all four sides";
//    }

    private double width = 1.0;
    private double length = 1.0;

    public Rectanglee() {
    }

    public Rectanglee(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectanglee(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public Rectanglee(String color, boolean filled, double width, double length, String string) {
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + " and length="
                + getLength()
                + ", which is a.txt subclass of "
                + super.toString();
    }
}