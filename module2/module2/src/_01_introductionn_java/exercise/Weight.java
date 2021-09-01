package _01_introductionn_java.exercise;
import java.util.Scanner;
public class Weight {
    public static void main(String[] args) {
        float weight , height , BMI;
        Scanner login = new Scanner(System.in);
        System.out.println("Enter the weight : ");
         weight = login.nextFloat();
        System.out.println("Enter the height : ");
         height = login.nextFloat();
        BMI = weight / height*height  ;
        if(BMI < 18.5){
            System.out.println("Underweight");
        }
        else if (18.5 <= BMI && BMI < 25){
            System.out.println("Normal");
        }
        else  if (25 <= BMI && BMI < 30){
            System.out.println("Overweight");
        }
        else if (BMI >= 30){
            System.out.println("Obese");
        }
    }
}
