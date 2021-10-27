package _13_sort_algorithm.excercise;

import java.util.Arrays;

public class InsertionSort {
    static int[] list = {22, 12, 312, 31, 23, 123};

    public static void insertSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int temp = list[i];
            int j;
            for (j = i - 1; j >= 0 && list[j] > temp; j--) {
                list[j + 1] = list[j];
            }
            list[j + 1] = temp;
        }
    }

    public static void main(String[] args) {
        insertSort(list);
        System.out.println(Arrays.toString(list));
    }
}
