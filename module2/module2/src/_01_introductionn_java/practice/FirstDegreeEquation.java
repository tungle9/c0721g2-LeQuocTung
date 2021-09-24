package _01_introductionn_java.practice;

import java.util.Scanner;
public class FirstDegreeEquation {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a.txt equation as 'a.txt * x + b.txt = c', please enter constants:");
        Scanner result = new Scanner(System.in);
        System.out.println("a.txt: ");
        double a = result.nextDouble();
        System.out.println("b.txt: ");
        double b = result.nextDouble();
        System.out.println("c : ");
        double c = result.nextDouble();
        if(a != 0 ){
            double answer = (c - b ) / a ;
            System.out.printf("Equation pass with x = %f!\n", answer);
        }else {
            if ( b == c ){
                System.out.print("the solution is all x!");
            }
            else {
                System.out.printf("No solution!");
            }
        }
    }
}

