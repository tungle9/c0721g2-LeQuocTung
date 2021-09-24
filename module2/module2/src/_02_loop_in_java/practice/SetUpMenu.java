package _02_loop_in_java.practice;

import java.util.Scanner;

public class SetUpMenu {
    public static void main(String[] args) {
        int choice =1;
        Scanner input = new Scanner(System.in);
        while(choice != 0){
            System.out.println("menu");
            System.out.println("1. Draw a.txt stairway");
            System.out.println("2. Draw a.txt square");
            System.out.println("3. Draw a.txt retangle");
            System.out.println("0. exit");
            System.out.println("your choice");
            choice = input.nextInt();
            switch (choice){
                case 1 :
                System.out.println("**");
                System.out.println("****");
                System.out.println("******");
                System.out.println("*********");
                System.out.println("*************");
                break;
                case 2 :
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 3 :
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 0 :
                    System.out.println("exit");break;
                default:
                    System.out.println("no choice");break;
            }
        }


    }
}
