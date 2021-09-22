package _14_exception.practice;

import _08_clean_code_refactoring.practice.Calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculationExample {
    static void calculate(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Tổng a +b  " + a);
            System.out.println("hiệu x - y " + b);
            System.out.println("tích x*y " + c);
            System.out.println("thương x/y " + d);
        } catch (Exception e) {
            System.err.println("ngoại lê :" + e.getMessage());
        }
    }
 //int x = Integer.parseInt(scanner.nextLine());
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check = true ;
        while (check) {
            check = false ;
            try {
                System.out.println("nhập x");
                int x = scanner.nextInt();
                System.out.println("nhập y");
                int y = scanner.nextInt();
                calculate(x, y);
            } catch (Exception e) {
                check= true ;
                System.out.println("nhập sai");
//                scanner.nextLine();
            }
        }
    }
}
