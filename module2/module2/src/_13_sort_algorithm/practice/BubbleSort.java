package _13_sort_algorithm.practice;

public class BubbleSort {
   static int []list = {12,312,31,23,12,12,3,};
    public static void bubble(int []list){
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
        }
    }
    public static void main(String[] args) {
        bubble(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }

}
