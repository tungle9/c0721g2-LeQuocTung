package _07_abstract_class_and_interface.excersice.resizeable;

public class Rectanglee extends Shapee implements Resizeable {
    private double width ;
    private double length ;
    public Rectanglee(String color, boolean filled, double width, double length, String string) {
    }

    @Override
    public double resize(double percent) {
        return getArea() * percent + getArea();
    }

    public Rectanglee() {
    }

    public Rectanglee(double width, double length) {
        this.width = width;
        this.length = length;
    }

//    public Rectanglee(double width, double length, String color, boolean filled) {
//        super(color, filled);
//        this.width = width;
//        this.length = length;
//    }

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
                + ", which is a.txt subclass of ";
    }

//    @Override
//    public double resize(double percent) {
//        double a.txt = getArea()*percent;
//        return  a.txt;
//    }
}