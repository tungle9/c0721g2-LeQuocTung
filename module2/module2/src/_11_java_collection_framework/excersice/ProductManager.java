package _11_java_collection_framework.excersice;

import java.util.*;

public class ProductManager {
    public static void main(String[] args) {
        Product product4 = new Product("fanta", 2, 100);
        Product product1 = new Product("simgum", 3, 20);
        Product product2 = new Product("pepsi", 4, 19);
        Product product3 = new Product("cigarette", 5, 8888);
        Function function = new Function();
        function.add(product4);
        function.add(product1);
        function.add(product2);
        function.add(product3);
        int login;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("MENU");
            System.out.println("1 : THÊM SẢN PHẨM ");
            System.out.println("2 : HIỂN THỊ DANH SÁCH");
            System.out.println("3 : XÓA SẢN PHẨM THEO ID");
            System.out.println("4 : TÌM KIẾM SẢN PHẨM THEO TÊN");
            System.out.println("5 : SẮP XẾP SẢN PHẨM TĂNG DẦN");
            System.out.println("6 : SẮP XẾP SẢN PHẨM GIẢM DẦN");
            System.out.println("7 : SỬA SẢN PHẨM");
            System.out.println("0 : Exit");
            login = scanner.nextInt();
            scanner.nextLine();
            switch (login) {
                case 1: // nhập
                    System.out.println("Tên");
                    String name = scanner.nextLine();
                    System.out.println("ID");
                    int id = scanner.nextInt();
                    System.out.println("giá");
                    double gia = scanner.nextDouble();
                    Product product = new Product(name, id, gia);
                    function.add(product);
                    break;
                // hiển thị
                case 2:
                    function.show();
                    break;
                case 3: // xóa
                    function.show();
                    System.out.println("nhập id ");
                    int id1 = scanner.nextInt();
                    function.delete(id1);
                    break;
                case 4:// tìm kiếm sản phẩm theo tên
                    System.out.println("nhập tên");
                    name = scanner.nextLine();
                    function.find(name);
                    break;
                case 5:  // sắp xếp theo giá tăng dần
                    function.sortUp();
                    break;
                case 6:  // sắp xếp theo giá giảm dần
                    function.sortDown();
                    break;
                case 7: // sửa sản phẩm
                    System.out.println("nhập id ");
                    id = scanner.nextInt();
                    function.edit(id);
                    break;
                case 0:
                    System.out.println("exit");
                    break;
            }
        } while (login != 0);
    }
}
