package _07_abstract_class_and_interface.practice.interface_comparator;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(10);
        circles[1] = new Circle();
        circles[2] = new Circle(3.5,"black",false);
        System.out.println();
        for ( Circle circle : circles){
            System.out.println(circle);
        }
        System.out.println("/");
        CircleComparator circleComparator = new CircleComparator();
        Arrays.sort(circles,circleComparator);
        for(Circle circle : circles){
            System.out.println(circle);
        }
    }
}
