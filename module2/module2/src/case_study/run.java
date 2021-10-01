package case_study;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class run {
    public static void main(String[] args) {
        int[] array = {21, 2, 41, 5, 16, 235};
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length ; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
//        HashMap<Integer,String> linkedHashMap = new HashMap<>();
//        linkedHashMap.put(1,"7");
//        linkedHashMap.put(7,"4");
//        linkedHashMap.put(5,"213");
//        linkedHashMap.put(null,null );
//            System.out.println(linkedHashMap);
//        HashMap<Integer,String> hashMap = new HashMap<>();
//        hashMap.put(null,"123");
//        System.out.println(hashMap);

    }
}