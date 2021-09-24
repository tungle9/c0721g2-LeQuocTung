package _16_binary_file_serialization.excercise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProducList producList = new ProducList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập sản phẩm");
        int login = 0;
        do {
            System.out.println("Menu");
            System.out.println("1.Hiển thị");
            System.out.println("2.Tìm kiếm thông tin sản phẩm");
            System.out.println("3.thêm sản phẩm");
            System.out.println("0.thoát chương trình");
            login = scanner.nextInt();
            scanner.nextLine();
            switch (login) {
                case 1:
                    producList.show();
                    break;
                //    File file = new File("src\\_16_binary_file_serialization\\excercise\\product.txt");
                case 2:
                    System.out.println("nhập tên");
                    String name = scanner.nextLine();
                    producList.find(name);
                    break;
                case 3:
                    producList.add();
                    break;
            }
        } while (login != 0);
    }
}
