package _02_loop_in_java.excercise;


import java.util.Scanner;

public class _20FirstNumPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
            boolean check = true;
            if (a < 2) {
                check = false;
            } else {
                for (int i = 2; i < a; i++) {
                    if (a % i == 0) {
                        check = false;
                        break;
                    }
                }
            }
            if (check) {
                System.out.println( a + ": là số nguyên tố ");
            }
            else {
                System.out.println("không phải là số nguyên tố ");
            }
    }
}

