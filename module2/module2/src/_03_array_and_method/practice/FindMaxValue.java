package _03_array_and_method.practice;

public class FindMaxValue {
    public static void main(String[] args) {
        int array[] = {1,244,2555,6};
        int max = array[0];
        for (int i =0 ; i < array.length;i++){
          if(array[i]>max){
              max= array[i];
          }
        }
        System.out.println(max);
    }
}
