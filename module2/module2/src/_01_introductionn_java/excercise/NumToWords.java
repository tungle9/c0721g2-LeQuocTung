package _01_introductionn_java.excercise;

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
        switch (num / 10) {// hàng chục
            case 1:
                switch (num % 10) {
                    case 0:
                        System.out.println("ten");
                        break;
                    case 1:
                        System.out.println("eleven");
                        break;
                    case 2:
                        System.out.println("twelve");
                        break;
                    case 3:
                        System.out.println("thirteen");
                        break;
                    case 4:
                        System.out.println("fourteen");
                        break;
                    case 5:
                        System.out.println("fifteen");
                        break;
                    case 6:
                        System.out.println("sixteen");
                        break;
                    case 7:
                        System.out.println("seventeen");
                        break;
                    case 8:
                        System.out.println("eightteen");
                        break;
                    case 9:
                        System.out.println("nineteen");
                        break;
                }
                break;
            case 2:
                System.out.println("twenty");
                break;
            case 3:
                System.out.println("thirty");
                break;
            case 4:
                System.out.println("fourty");
                break;
            case 5:
                System.out.println("fifty");
                break;
            case 6:
                System.out.println("sixty");
                break;
            case 7:
                System.out.println("seventy");
                break;
            case 8:
                System.out.println("eighty");
                break;
            case 9:
                System.out.println("ninety");
                break;
        }
        switch (num % 10 ) {  //đơn vị
            case 1:
                System.out.println("one");
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
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;
            case 10:
                System.out.println("ten");
                break;
        }

    }
}



