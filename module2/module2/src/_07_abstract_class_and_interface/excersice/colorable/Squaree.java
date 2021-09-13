package _07_abstract_class_and_interface.excersice.colorable;

public class Squaree extends Rectanglee implements Corlorable {
    @Override
    public String howtoColor() {
        return "Color all four sides";
    }

    public double side;

    public double Squaree(double side) {
        return this.side;
    }

    public Squaree(double side) {
        this.side = side;
    }

    public double getArea() {
        return this.side * this.side;
    }

    public Squaree(double width, double length) {
        super(width, length);
    }

    public Squaree(String color, boolean filled, double width, double length, String string) {
        super(color, filled, width, length, string);
    }

    @Override
    public String toString() {
        return "Squaree{" +
                "side=" + side +
                '}';
    }

    public static void main(String[] args) {
        Squaree square = new Squaree(23123);
        System.out.println(square);
        square = new Squaree("white", false, 10123, 222, "holy");
        System.out.println(square);
    }

}
