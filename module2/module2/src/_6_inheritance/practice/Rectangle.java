package _6_inheritance.practice;

public class Rectangle extends Shape   {
    private double width = 1;
    private double length = 1;
    private String string = "Cry";
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public Rectangle(String color, boolean filled, double width, double length,String string) {
        super(color, filled);
        this.width = width;
        this.length = length;
        this.string = string ;
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                ", string ="+string+
                '}';
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(12, 10);
        System.out.println(rectangle);

        rectangle = new Rectangle("Yellow",true ,9,11,"smile");
        System.out.println(rectangle);
    }
}