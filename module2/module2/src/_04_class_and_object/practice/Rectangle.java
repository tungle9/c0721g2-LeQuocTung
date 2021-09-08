package _04_class_and_object.practice;

public class Rectangle {
    int width, height;

    public double area(double a, double b) {
        double sum = this.width * this.height;
        return sum;
    }

    public double perimeter(double a, double b) {
        double per = (this.width + this.height) / 2;
        return per;
    }

    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.width = 10;
        rec.height = 20;
        System.out.println("area=" + rec.area(rec.width, rec.height));
        System.out.println("perimeter=" + rec.perimeter(rec.width, rec.height));
    }
}
