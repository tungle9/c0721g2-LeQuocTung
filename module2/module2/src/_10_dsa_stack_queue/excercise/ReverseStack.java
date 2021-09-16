package _10_dsa_stack_queue.excercise;

import java.util.Arrays;
import java.util.Stack;

public class ReverseStack {
    public static <arr> void main(String[] args) {
        Stack<Integer> stacks = new Stack<>();
        int[] array = {1, 2, 3, 4};
        for (int value : array) {
            stacks.push(value);
        }
        for (int j = 0; j < array.length; j++) {
            array[j] = stacks.pop();
        }
        System.out.println(Arrays.toString(array));
//        for(int i = array.length ; i > 0  ;i--){
//            stacks.push(array[i-1]);
//        }
//        System.out.println(stacks);
        Stack<String> stack = new Stack<>();
        String arr[] = {"Le", "Quoc", "Tung"};
//        for (int i = 0; i < arr.length; i++) {
//            stack.push(arr[i]);
        for(String a : arr){
            stack.push(a);
        }
        for (int j = 0; j < arr.length; j++) {
            arr[j] = stack.pop();
        }
        System.out.println(Arrays.toString(arr));
    }
}

