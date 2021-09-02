package _02_loop_in_java.practice;

import java.util.Scanner;

public class CommonDivisor {
    public static void main(String[] args) {
        Scanner login = new Scanner(System.in);
        System.out.println("login A");
        int a = login.nextInt();
        System.out.println("login B");
        int b = login.nextInt();
        int common = 1   ;
        for(int i = 1 ; i < a && i < b ;i++ ){
            if (a%i== 0 && b%i == 0 ) {
                common = i;
            }
        }
        System.out.printf("ước chung lớn nhất %d và %d là %d",a,b,common);
    }
}
