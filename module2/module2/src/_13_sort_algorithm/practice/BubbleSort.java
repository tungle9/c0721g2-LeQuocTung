package _13_sort_algorithm.practice;

import java.util.Arrays;

public class BubbleSort {
    static int[] list = {12, 312, 31, 23, 12, 12, 3,};

    public static void bubble(int[] list) {
        for (int i = 1; i < list.length; i++) {
            for (int j = 0; j < list.length - i; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        bubble(list);
        System.out.println(Arrays.toString(list));
    }
}