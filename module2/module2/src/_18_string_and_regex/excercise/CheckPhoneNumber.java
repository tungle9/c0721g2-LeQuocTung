package _18_string_and_regex.excercise;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CheckPhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số điện thoại");
        Pattern p = Pattern.compile("^[(][0-9]{2}[)]-[(]0[0-9]{9}[)]$");
        //format (XX)-(0XXXXXXXXX)
        String text = scanner.nextLine();
        if (p.matcher(text).find() == true) {
            System.out.println("sdt hợp lệ");
        } else {
            System.err.println("sdt không hợp lệ");
        }
    }
}