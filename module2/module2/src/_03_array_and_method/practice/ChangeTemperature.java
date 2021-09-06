package _03_array_and_method.practice;

import java.util.Scanner;

public class ChangeTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double c, f;
        do {
            System.out.println("Menu");
            System.out.println("1 F to C");
            System.out.println("2 C to F");
            System.out.println("0 Exit");
            System.out.println("login your choice : ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("login F");
                    f = scanner.nextDouble();
                    System.out.println("F to C : " + DoF(f));
                    break;
                }
                case 2: {
                    System.out.println("login C");
                    c = scanner.nextDouble();
                    System.out.println("C to F : " + DoC(c));
                    break;
                }
                case 0: {
                    System.out.println("exit");
                    break;
                }
            }
        } while (choice != 0) ;
    }
        public static double DoC(double b){//b là fahre
            double DoC = (5 / 9) * (b - 32);
            return DoC;
        }
        public static double DoF( double a){//a là độ c
            double DoF = 9 / 5 * a + 32;
            return DoF;
        }
    }
//celsius = (5.0 / 9) * (fahrenheit - 32)