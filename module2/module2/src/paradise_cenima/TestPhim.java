package paradise_cenima;

import java.util.Scanner;

public class TestPhim {
    public static void main(String[] args) {
        Function list = new Function();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chương trình");
        int login;
        do {
            System.out.println("1. Danh sách phim \n" +
                    "2. Thêm mới suất chiếu \n" +
                    "3. Xóa suất chiếu theo mã \n" +
                    "4. Thoát chương trình  \n");
            login = Integer.parseInt(scanner.nextLine());
            switch (login) {
                case 1:
                    list.show();
                    break;

                case 2:
                    list.add();
                    break;

                case 3:
                    list.show();
                    System.out.println("nhập mã phim để xóa ");
                    String maPhim = scanner.nextLine();
                    System.out.println(list.delete(maPhim));
                    break;
                case 4:
                    System.out.println(" Đã thoát chương trình");
                    break;

            }
        }
        while (login != 4);
    }
}