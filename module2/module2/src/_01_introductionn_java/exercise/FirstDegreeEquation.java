package _01_introductionn_java.exercise;

import java.util.Scanner;
public class FirstDegreeEquation {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = c', please enter constants:");
        Scanner result = new Scanner(System.in);
        System.out.println("a: ");
        double a = result.nextDouble();
        System.out.println("b: ");
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

