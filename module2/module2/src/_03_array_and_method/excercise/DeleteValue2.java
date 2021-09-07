package _03_array_and_method.excercise;

import java.util.Scanner;

public class DeleteValue2 {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7};
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số muốn xóa");
        int index = scanner.nextInt(); // số cần xóa
        int temp = array.length;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == index) {
                int pos = i;
                for (int j = pos; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                temp--;
            }
        }
        for (int i = 0; i < temp; i++) {
            System.out.print(array[i] + ",");
        }
    }
}

