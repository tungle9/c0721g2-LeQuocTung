package _03_array_and_method.practice;

public class FindMinValue_UseMethod {
    public static void main(String[] args) {
        int[] array = {3, 2, 5, };
        int min = min(array);
        System.out.println("min : " + min);
    }

    public static int min(int[] array) {
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[min] > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
