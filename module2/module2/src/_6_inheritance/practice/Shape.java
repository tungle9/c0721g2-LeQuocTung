package _6_inheritance.practice;

public class Shape {
    String color = "green";
    boolean filled = true;

    public Shape() {
    }
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    @Override
    public String toString() {
        return "Shapeee{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
        shape = new Shape("cerulean",false);
        System.out.println(shape);
    }
}
