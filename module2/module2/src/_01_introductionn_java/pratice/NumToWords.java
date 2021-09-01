package _01_introductionn_java.pratice;

import java.util.Scanner;

public class NumToWords {
    public static void main(String[] args) {
        int num;
        Scanner login = new Scanner(System.in);
        System.out.println("login num");
        num = login.nextInt();
        if (num >= 100 && num < 1000) {
            switch (num / 100) {
                case 1:
                    System.out.println("one hundered");
                    break;
                case 2:
                    System.out.println("two hundered");
                    break;
                case 3:
                    System.out.println("three hundered");
                    break;
                case 4:
                    System.out.println("four hundered");
                    break;
                case 5:
                    System.out.println("five hundered");
                    break;
                case 6:
                    System.out.println("six hundered");
                    break;
                case 7:
                    System.out.println("seven hundered");
                    break;
                case 8:
                    System.out.println("eight hundered");
                    break;
                case 9:
                    System.out.println("nine hundered");
                    break;
            }
            num = num % 100;
        }
//        if(num < 100){
        switch (num / 10) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one ");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven ");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;
        }
//    num = num * 10 ;

        switch (num % 10) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one ");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven ");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;
        }
    }
}
