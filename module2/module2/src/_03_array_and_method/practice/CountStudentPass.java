package _03_array_and_method.practice;

import java.util.Scanner;

public class CountStudentPass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập phần tử");
        int size ;
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
                if (array[i] > 5 && array[i] < 10) {
                    System.out.println("thí sinh đỗ điểm là " + array[i]);
                }
            }
     //   System.out.print(array+"\t");
    }
}
