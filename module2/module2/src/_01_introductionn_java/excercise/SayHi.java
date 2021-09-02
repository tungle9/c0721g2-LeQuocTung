package _01_introductionn_java.excercise;
import java.util.Scanner;
public class SayHi{
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
       System.out.println("login name");
      String display = name.nextLine();
       System.out.println("Bonjour "+display);
    }
}
