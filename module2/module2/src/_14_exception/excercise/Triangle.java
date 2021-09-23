package _14_exception.excercise;

import java.util.Scanner;

public class Triangle {

    public static void inputTriangle(int x, int y, int z) throws IllegalTriangleException {
        if (x <= 0 || y <= 0 || z <= 0) {
            throw new IllegalTriangleException("không phải 1 tam giác");
        }
        if (x + y < z || x + z < y || z + y < x) {
            throw new IllegalTriangleException("không phải 1 tam giác");

        } else {
            System.out.println("là 1 tam giác");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("nhập cạnh a ");
            int a = scanner.nextInt();
            System.out.println("cạnh b ");
            int b = scanner.nextInt();
            System.out.println("cạnh c");
            int c = scanner.nextInt();
            inputTriangle(a, b, c);
        } catch (Exception e) {
            System.err.println("bạn nhập sai");
        }
    }
}

