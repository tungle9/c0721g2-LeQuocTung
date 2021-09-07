package _03_array_and_method.excercise;

import java.util.Scanner;

public class AddValueArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("vị trí chèn");
        int index = scanner.nextInt(); // vị trí cần chèn
        System.out.println("số muốn điền vào");
        int num = scanner.nextInt();//số chèn vào;
        int[] array = {1, 3, 4, 5, 6, 7};
        int[] arrayA = new int[array.length + 1]; //mảng mới
        for (int i = 0; i < arrayA.length; i++) { //
            if (index == i) {
                arrayA[i] = num;
            } else if (i < index) { // i = 0 ; index = 1 chèn
                arrayA[i] = array[i];
            }else {
                arrayA[i] = array[i-1] ;
            }
        }
        array[index] = num;
//        System.out.println(array);
        for (int j = 0; j < arrayA.length; j++) {
            System.out.print(arrayA[j] + ",");
        }

    }
}
