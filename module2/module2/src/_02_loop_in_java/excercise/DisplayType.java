package _02_loop_in_java.excercise;

import java.util.Scanner;

public class DisplayType {
    public static void main(String[] args) {
        int choice =1;
        Scanner input = new Scanner(System.in);
        while(choice != 0){
            int i , j ;
            System.out.println("menu");
            System.out.println("1. Draw a.txt stairway");
            System.out.println("2. Draw a.txt square");
            System.out.println("3. Draw a.txt retangle");
            System.out.println("0. exit");
            System.out.println("your choice");
            choice = input.nextInt();
            switch (choice){
                case 1 : for( i = 1 ; i <= 5 ; i++){
                    for( j = 1 ; j <= i ;j++ ){
                        System.out.print('*');
                    }
                    System.out.println("");
                }
                    break;
                case 2 : for ( i = 1 ; i <= 5;i ++ ){
                    for( j = 5 ; j >= i;j--){
                        System.out.print('*');
                    }
                    System.out.println("");
                }
                    break;
                case 3 : for (i = 1; i <= 3  ; i++ ){ //1
                    for (j = 1 ; j <= 7 ; j++ ){ //1 > 7
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                    break;
                case 0 :
                    System.out.println("Exit");break;
                default:
                    System.out.println("error");
            }
        }
    }
}
