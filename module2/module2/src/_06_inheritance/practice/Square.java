package _06_inheritance.practice;

public class Square extends Rectangle   {

    public Square(double side) {
        super(side, side);
    }
    public Square(double width, double length) {
        super(width, length);
    }
    public Square(String color, boolean filled, double width, double length,String string ) {
        super(color, filled, width, length,string);
    }
    @Override
    public String toString() {
        return "A Square with side="
                + ", which is a.txt subclass of "
                + super.toString();
    }
    public static void main(String[] args) {
        Square square = new Square(23123);
        System.out.println(square);
        square = new Square("white",false ,10123,222,"holy");
        System.out.println(square);
    }
}
