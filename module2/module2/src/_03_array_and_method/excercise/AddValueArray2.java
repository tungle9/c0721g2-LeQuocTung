package _03_array_and_method.excercise;

import java.util.Scanner;

public class AddValueArray2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("vị trí chèn");
        int index = scanner.nextInt(); // vị trí cần chèn
        System.out.println("số muốn điền vào");
        int num = scanner.nextInt();//số chèn vào;
        int[] array = {1, 3, 4, 5, 6, 7};
        int n = array.length;
        for (int i = n-1; i > index; i--) {
            array[i] = array[i -1];
        }
        array[index] = num ;
        n++ ;
        for (int j = 0 ; j < n;j++ ){
            System.out.print(array[j]+",");
        }
    }

}