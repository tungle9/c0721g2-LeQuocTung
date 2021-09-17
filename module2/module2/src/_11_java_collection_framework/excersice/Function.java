package _11_java_collection_framework.excersice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Function {
    private ArrayList<Product> list;

    public Function(ArrayList<Product> list) {
        this.list = list;
    }

    public Function() {
        this.list = new ArrayList<>();
    }

    public void add(Product product) {
        list.add(product);
    }

    public void show() {
        for (Product product : list) {
            System.out.println(product);
        }
    }

    public String delete(int id) {
        for (Product product : list) {
            if (product.getId() == id) {
                list.remove(product);
                return "đã xóa ";
            }
        }
        return "sản phẩm không có";
    }

    public void find(String name) {
        boolean check = false;
        for (Product name1 : list) {
            if (name1.getName().equals(name)) {
                System.out.println("có sản phẩm " + name1);
                check = true;
            }
        }
        if (!check) {
            System.out.println("sản phẩm không có ");
        }
    }

    Scanner scanner = new Scanner(System.in);

    public void edit(int idNew) {   //sửa sản phẩm
        for (Product product : list) {
            if (product.getId() == idNew) {
                System.out.println("Tên");
                String name = scanner.nextLine();
                System.out.println("ID");
                int id = scanner.nextInt();
                System.out.println("giá");
                double gia = scanner.nextDouble();
                product.setName(name);
                product.setId(id);
                product.setPrice(gia);
                break;
            }
        }
    }

    public void sortUp() {
        Collections.sort(list, new SortUp());
    }

    public void sortDown() {
        Collections.sort(list, new SortDown());
    }
}

