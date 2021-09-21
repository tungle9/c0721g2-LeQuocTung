package c.controllers;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chương trình");
        int login = 0;
        int login1;
        do {
            System.out.println("1.\tEmployee Management");
            System.out.println("2.\tCustomer Management");
            System.out.println("3.\tFacility Management ");
            System.out.println("5.\tPromotion Management");
            System.out.println("6.\tExit");
            login = scanner.nextInt();
            switch (login) {
                case 1 :
                        System.out.println("1.display");
                        System.out.println("2.Add new employee");
                        System.out.println("3.Edit employee");
                        System.out.println("4.return main menu ");
                        System.out.println("0. exit ");
                case 2:
                    switch (login) {
                        case 1:
                            System.out.println("1.Display list customers");
                            break;

                        case 2:
                            System.out.println("2.\tAdd new customer");
                            break;

                        case 3:
                            System.out.println("3.\tEdit customer");
                            break;

                        case 4:
                            System.out.println("4.\tReturn main menu");
                            break;
                    }
                    ;
                    break;
                case 3:
                    switch (login) {
                        case 1:
                            System.out.println("1\tDisplay list facility");
                            break;

                        case 2:
                            System.out.println("2\tAdd new facility");
                            break;

                        case 3:
                            System.out.println("3\tDisplay list facility maintenance");
                            break;

                        case 4:
                            System.out.println("4\tReturn main menu");
                            break;
                    }
                    break;
                case 4:
                    switch (login) {
                        case 1:
                            System.out.println("1.\tAdd new booking");
                            break;

                        case 2:
                            System.out.println("2.\tDisplay list booking");
                            break;

                        case 3:
                            System.out.println("3.\tCreate new constracts");
                            break;

                        case 4:
                            System.out.println("4.\tDisplay list contracts");
                            break;
                        case 5:
                            System.out.println("5.\tEdit contracts");
                            break;
                        case 6:
                            System.out.println("6.\tReturn main menu");
                            break;
                    }
                    break;
                case 5:
                    switch (login) {
                        case 1:
                            System.out.println("1.\tDisplay list customers use service");
                            ;
                            break;

                        case 2:
                            System.out.println("2.\tDisplay list customers get voucher");
                            ;
                            break;

                        case 3:
                            System.out.println("3.\tReturn main menu");
                            ;
                            break;
                    }
                case 6:
                    System.out.println("exit");
                    break;
            }
        } while (login != 6);
    }
}