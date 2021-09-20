package c.controllers;

import java.util.Scanner;

public class FuramaController {
    public void display() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chương trình");
        int login = 0;
        login = scanner.nextInt();
        do {
            System.out.println("1.Employee Management");
            System.out.println("2.\tCustomer Management");
            System.out.println("3.\tFacility Management ");
            System.out.println("5.\tPromotion Management");
            System.out.println("6.\tExit");
            switch (login) {
                case 1 :
                    System.out.println("display");
            }
        }  while (login != 6) ;
    }
}