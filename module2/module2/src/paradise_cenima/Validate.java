package paradise_cenima;

import java.net.PortUnreachableException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Validate {
    static Scanner scanner = new Scanner(System.in);
    public static final String TENPHIM = "^[A-Z][a-z]*$";
    public static final String NGAYCHIEU = "^[1-9]*[0-9]?$";
    public static final String MASUATCHIEU = "^[C][L][-][1-9][0-9]{3}$";

    public static String checkFilm(String regex, String mess) {
        while (true) {
            System.out.println(mess);
            String value = scanner.nextLine();
            if (Pattern.matches(regex, value)) {
                return value;
            } else {
                System.err.println("bạn nhập sai mời nhập lại");
            }
        }
    }
    public static String mess(){
        return "nhập đúng định dang của hảng phim CL-XXXX với X là 1 một số  ";
    }
}
