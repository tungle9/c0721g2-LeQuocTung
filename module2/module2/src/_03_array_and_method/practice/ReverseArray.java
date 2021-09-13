package _03_array_and_method.practice;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] array = {1,2,3,4};
//     IntegerBuilder s =
      int first = 0;
      int last = array.length-1;
   int temp ;
      while(first < last){
          temp = array[first];
          array[first] = array[last];
          array[last] = temp;
          first ++;
          last --;
      }
      for (int i = 0; i < array.length;i++){
          System.out.print(array[i]+" ");
      }
    }
}
