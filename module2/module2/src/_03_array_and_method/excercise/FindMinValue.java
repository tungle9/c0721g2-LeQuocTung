package _03_array_and_method.excercise;
public class FindMinValue {
    public static void main(String[] args) {
        int array[] = {244, 1, 2555, 6};
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]< array[min]) {
                array[min] = array[i];
            }
        }
        System.out.println(array[min]);
    }
}
