package _03_array_and_method.excercise;

import java.util.Scanner;

public class DeleteValueArray {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7};
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vị trí muốn xóa");
        int login = scanner.nextInt(); // vị trí xóa
        int temp = array.length;
        for (int i = login; i < array.length-1; i++) {
            array[i] = array[i + 1];
        }
        temp--;
        for (int i = 0; i < temp; i++) {
            System.out.print(array[i]+",");
        }
    }
}

