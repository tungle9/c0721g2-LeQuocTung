package _02_loop_in_java.practice;

import java.util.Scanner;

public class InterestMoney {
    public static void main(String[] args) {
        Scanner login = new Scanner(System.in);
        //Scanner logina = new Scanner(System.in);
        double interestMoney = 0; // tiền lãi
        System.out.println("nhập số tiền gửi");
        double deposits = login.nextDouble(); // tiền gửi
        System.out.println("số tháng gửi");
        float months = login.nextInt();
        for(int i = 1 ; i <= months ; i++){
            interestMoney =  deposits *(0.5/100)*months; // tiền lãi 0.5% 1 tháng

        }
       System.out.println("số tiền lãi : "+interestMoney +",số tháng gửi : "+ months);
    }
}
