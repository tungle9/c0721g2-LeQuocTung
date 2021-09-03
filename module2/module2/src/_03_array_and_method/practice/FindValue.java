package _03_array_and_method.practice;

import java.util.Scanner;

public class FindValue {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("login name ");
        String login = scanner.nextLine();
        boolean check = false ;
        for (int i = 0; i < students.length; i++) {
            if
            (students[i].equals(login)) {
                System.out.println("found :" + students[i]);
                check = true  ;
                break;
            } if(check){
                System.out.println("dont have the name ");
                break;
            }
        }
    }
}
