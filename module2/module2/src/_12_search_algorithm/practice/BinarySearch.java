package _12_search_algorithm.practice;

import java.util.Arrays;

public class BinarySearch {
    static int[] list = {12,3123,123,5,123,12,1,123,2,3,};
    static int binarySearch(int[] list , int key ){
        int left = 0 ;
        int right = list.length-1;
        while(right >= left){
            int mid = (left + right) / 2 ;
            if ( key  < list[mid])
                right = mid - 1 ;
            else if(key == list[mid])
                return mid ;
            else left = mid + 1 ;
        }
        return -1 ;
    }
    static void sort(int [] list ){
        int temp = 0 ;
        for ( int i =  0 ; i < list.length;i++){
            for (int j = i+1 ;j < list.length;j ++){
                if(list[j] < list[i]){
                    temp = list[j];
                    list[j] = list[i];
                    list[i]= temp ;
                }
            }
        }
    }

    public static void main(String[] args) {
        sort(list);
        System.out.println("sắp xếp mảng " + Arrays.toString(list));
        //tìm key = 5 ;
        System.out.println("vị trí " +  binarySearch( list , 5));
        System.out.println("vị trí " +  binarySearch( list , 3123));
    }
}
