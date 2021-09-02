package _01_introductionn_java.practice;

import java.util.Scanner;

public class CheckYear {
    public static void main(String[] args) {
        Scanner login = new Scanner(System.in);
        int year;
        System.out.println("Enter the year");
        year = login.nextInt();
        if (year % 100 == 0 && year % 400 == 0) {
            System.out.printf("%d là năm nhuận",year);
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.printf("%d là năm nhuận",year);
        } else if (year % 100 == 0 && year % 400 != 0) {
            System.out.printf("%d không phải là năm nhuận",year);
        }
    }
}
