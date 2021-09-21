package _13_sort_algorithm.practice;

import java.util.Scanner;

public class BubbleSortByStep {
    public static void bubbleSort(int[] list){
        boolean check = true ;
        for(int i = 1 ; i < list.length && check;i++){
            check = false;
            for(int j = 0 ; j< list.length- i;j++){
                if(list[j] > list[j+1]){
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp ;
                    check = true ;
                }
            }
            if(check == false ){
                System.out.println("Array may be sorted and next pass not needed");
            break;}
            System.out.print("List after the  " + i + "' sort: ");
            for(int a = 0 ; a <list.length;a++){
                System.out.print(list[a]+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập size");
        int size = scanner.nextInt();
        int []list = new int[size];
        for(int i = 0 ; i < list.length;i++){
            System.out.println("nhập giá trị thứ " + i  );
           list[i] = scanner.nextInt();
        }
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println("");
        bubbleSort(list);
    }
}
