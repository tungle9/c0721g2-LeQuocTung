package _07_abstract_class_and_interface.excersice.resizeable;

public class Squaree extends Rectanglee implements Resizeable {
    private double side;
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Squaree(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }
    public Squaree(double width, double length) {
        super(width, length);
    }
    @Override
    public double resize(double percent) {
        double a = getArea() * percent + getArea();
        return a;
    }

    @Override
    public String toString() {
        return "A Square with side="
                + ", which is a subclass of "
                + super.toString();
    }

    public static void main(String[] args) {
//        Squaree squaree = new Squaree(10);
//        System.out.println(squaree.getArea());
//       squaree = new Squaree("red",true,10,10,"abc");
//        System.out.println(squaree.toString());
    }
}
