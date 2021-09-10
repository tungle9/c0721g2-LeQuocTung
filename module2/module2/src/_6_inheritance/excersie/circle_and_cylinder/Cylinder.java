package _6_inheritance.excersie.circle_and_cylinder;

public class Cylinder extends Circle {
    private double height;

    Cylinder() {
    }

    public Cylinder(String color, double radius, double height) {
        super(color, radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double TheTich() {
        double V = Math.PI * getRadius() * height;
        return V;
    }
//    @Override    // ghi đè phương thức     // modifer lớp con phải lớn hơn hoặc bằng
//     void alo(){
//        System.out.println("xyz");
//    }

    @Override
    public String toString() { // phương thức ghi đè từ lớp cha (Circle)
        return "Cylinder{" +
                "height=" + height +
                ", color='" + getColor() + '\'' +
                ", radius=" + getRadius() +
                '}';
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(5);
        System.out.println("radius: "+circle.getArea());
        System.out.println(circle.toString());
        System.out.println();
        ///
        Cylinder cylinder = new Cylinder();
        cylinder = new Cylinder("yellow", 10, 121);
        System.out.println(cylinder.toString());
        System.out.println("thế tích là " + cylinder.TheTich());
       cylinder.setRadius(10);
        System.out.println(cylinder.getRadius());

    }
}
