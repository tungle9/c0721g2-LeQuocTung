package _01_introductionn_java.pratice;
import java.util.Scanner;
public class ChangeMoney {
    public static void main(String[] args) {
        int num = 23000;
        Scanner login = new Scanner(System.in);  // lệnh nhập
        System.out.println("Menu  "); // hiển thị
        System.out.println("1.VND to USD");  // hiển thị
        System.out.println("2.USD to VND"); // hiển thị
        System.out.println("pls pick numbeer"); //hiển thị
        int choose = login.nextInt(); // khai báo biến đếm bằng longin tức số
        if (choose == 1 ) {
            System.out.print("login(VND) "); // hiển thị
            choose = login.nextInt(); // cho phép nhập
            System.out.println("result : " + choose / num + " USD ");
        }
        if (choose == 2) {
            System.out.print("login(VND) ");
            choose = login.nextInt();
            System.out.println("result " + choose / num + " USD ");
        } else {
            System.out.printf("error");
        }
//                choose = login.nextInt();
////            int display = login.nextInt();
//                System.out.println("Số Tiền  " + choose * num + "VND");
//            }
    }
}

