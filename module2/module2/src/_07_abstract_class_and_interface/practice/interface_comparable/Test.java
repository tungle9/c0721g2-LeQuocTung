package _07_abstract_class_and_interface.practice.interface_comparable;
import java.util.Arrays;


public class Test {
    public static void main(String[] args) {
        ComparableCricle[] cricles = new ComparableCricle[3];
        cricles[0] = new ComparableCricle(1);
        cricles[1] = new ComparableCricle(10);
        cricles[2] = new ComparableCricle(3,"green",true);
        System.out.println("Pre-sorted:");
        for (ComparableCricle circle : cricles) {
            System.out.println(circle);
        }
        Arrays.sort(cricles);
        System.out.println("After-sorted:");
        for (ComparableCricle circle : cricles) {
            System.out.println(circle);
        }
    }
}
