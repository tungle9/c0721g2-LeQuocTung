package _10_dsa_stack_queue.practice;

public class GenericStackClient {
    public static void main(String[] args) {
        MyGenericStack<Integer> stack = new MyGenericStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.size());
        }
    }
