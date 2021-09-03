package _03_array_and_method.excercise;

import java.util.Scanner;

public class AddValueArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("vị trí chèn");
        int login = scanner.nextInt(); // vị trí cần chèn
        System.out.println("số muốn điền vào");
        int index = scanner.nextInt();//số chèn vào;
       // int abc= 3;
        int []array = {1,3, 4, 5, 6, 7};
        int n = array.length-1; //số lượng phần tử
//int temp = array.length;
         for(int i = n; i > login;i--){
             array[i] = array[i-1] ;
         }
         array[login] = index;
        System.out.println(array);
        for(int i = 0 ;i < array.length;i++){
            System.out.println(array[i]+",");
        }
    }
}
