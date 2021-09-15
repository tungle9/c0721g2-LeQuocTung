package _10_dsa_stack_queue.excercise;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> stacks = new Stack<>();
        int array[] = {1,2,3,4};
        for(int i = array.length ; i > 0  ;i--){
            stacks.push(array[i-1]);
        }
        System.out.println(stacks);
        Stack<String> stack = new Stack<>();
        String arrayy[] = {"Le","Quoc","Tung"};
        for(int i = arrayy.length  ; i > 0 ;i--){
            stack.push(arrayy[i-1]);
        }
        System.out.println(stack);
    }
}