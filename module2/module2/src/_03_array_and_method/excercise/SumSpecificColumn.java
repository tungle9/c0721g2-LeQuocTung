package _03_array_and_method.excercise;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class SumSpecificColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số hàng");
        int row = scanner.nextInt();
        System.out.println("nhập số cột");
        int column = scanner.nextInt();
        int num[][] = new int[row][column];
        for (int i = 0; i < row; i++) { /// tạo 1 mảng 2 chiều
            for (int j = 0; j < column; j++) {
                System.out.print("Nhập phần tử " + i + ", " + j + ": ");
                num[i][j] = scanner.nextInt();
            }
        }  // hiển thị mảng 2 chiều vửa tạo
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(num[i][j] + "\t");  //tab
            }
            System.out.println("");
        }
        System.out.println("số cột muốn tính tổng");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < row; i++) { // duyệt hàng
            sum = sum + num[i][n];
        } // sau khi tính tổng cột
        System.out.println("tổng cột là "+sum);
    }
}
