package _18_string_and_regex.excercise;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CheckClassName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern p = Pattern.compile("^[CAP][0-9]{4}[GHIKLM]*$");
        System.out.println("nhập tên lớp học");
        String text = scanner.nextLine();
        p.matcher(text).find();
        System.out.println(p.matcher(text).find());
        if (p.matcher(text).find() == true) {
            System.out.println("lớp học hợp lệ");
        } else {
            System.err.println("lớp học không hợp lệ");
        }
    }
}
