package _02_loop_in_java.practice;

import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner login = new Scanner(System.in);
        System.out.println("Login number");
        int num = login.nextInt();
        if (num < 2) {
            System.out.println("is not primer number");
        } else {
            int i = 2;
            boolean check = true;
            while (i < num ){
                if (num % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(num + "is number prime");
            } else {
                System.out.println(num + "is not number prime");
            }
        }
    }
}
