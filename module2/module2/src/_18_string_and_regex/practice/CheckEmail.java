package _18_string_and_regex.practice;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CheckEmail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern p = Pattern.compile("^[a-zA-Z0-9]+@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)$");//a@gmail.com

        while (true) {
            System.out.println("nhập email");
            String text = scanner.nextLine();//name@gmail.com
            p.matcher(text).find();
            if (p.matcher(text).find()) {
                System.out.println(p.matcher(text).find());
            } else {
                System.err.println("email không hợp lệ");
                break;
            }
        }
    }
}
