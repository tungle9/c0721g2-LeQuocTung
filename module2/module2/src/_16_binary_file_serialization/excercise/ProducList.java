package _16_binary_file_serialization.excercise;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProducList {
    private static File file = new File("src\\_16_binary_file_serialization\\excercise\\product.txt");
    public static List<Product> list = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    public static void write(List<Product> products) {
        try {
           FileOutputStream fm = new FileOutputStream(file,true);
           ObjectOutputStream om = new ObjectOutputStream(fm);
           om.writeObject(products);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Product> read() {
        List<Product> products = new ArrayList<>();
        try {
            FileInputStream fm = new FileInputStream(file); // đọc dữ liệu
            ObjectInputStream om = new ObjectInputStream(fm);
            products = (List<Product>) om.readObject();
            fm.close();
            om.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return products;
    }
    public static void add() {
        System.out.println("nhập mã");
        int code = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên");
        String name = scanner.nextLine();
        System.out.println("nơi sản xuất");
        String nsx = scanner.nextLine();
        System.out.println("giá");
        double price = scanner.nextDouble();
        Product product = new Product(code, name, nsx, price);
        if (file.length() > 0) {
            list = read();
        }
        list.add(product);
        write(list);
    }
    public static void find(String name) {
        List<Product> products = read();
        for (Product product : products) {
            if (product.getName().equals(name)) {
                System.out.println("sản phẩm " + product);
            }
        }
    }

    public static void show() {
        List<Product> products = read();
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
