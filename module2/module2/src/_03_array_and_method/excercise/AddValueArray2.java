package _03_array_and_method.excercise;

import java.util.Arrays;
import java.util.Scanner;

public class AddValueArray2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("vị trí chèn");
        int index = scanner.nextInt(); // vị trí cần chèn
        System.out.println("số muốn điền vào");
        int num = scanner.nextInt();//số chèn vào;
        int[] array = {1, 3, 4, 5, 6, 7};
        int[] n = new int[array.length + 1];
        for (int j = 0; j < array.length; j++) {
            n[j] = array[j];
        }
        for (int i = n.length - 1; i > index; i--) { // i = 5 ; 5 < 7 ; 5 ++
            n[i] = n[i - 1];
        }
        n[index] = num;
        for (int j = 0; j < n.length; j++) {
            System.out.print(n[j] + ",");
        }
    }
}