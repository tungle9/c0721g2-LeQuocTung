package _01_introductionn_java.exercise;

import java.util.Scanner;
public class UseMath {
    public static void main(String[] args) {
        float width ;
        float height ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width : ");
        width = scanner.nextFloat();// nhập chiều rộng
        System.out.println("Enter height : ");
        height = scanner.nextFloat(); // cao
        float result = width * height ;
        System.out.println("result = :" + result);
    }
}
