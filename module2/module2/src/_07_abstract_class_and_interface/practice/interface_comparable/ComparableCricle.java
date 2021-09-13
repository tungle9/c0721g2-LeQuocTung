package _07_abstract_class_and_interface.practice.interface_comparable;

public class ComparableCricle extends Circle implements Comparable<ComparableCricle> {

    public ComparableCricle(double radius) {
        super(radius);
    }

    public ComparableCricle() {
    }

    public ComparableCricle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public int compareTo(ComparableCricle o) {
        if (getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 1;
    }
}
