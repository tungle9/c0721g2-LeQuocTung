package _10_dsa_stack_queue.practice;

public class TestQueue {
    public static void main(String[] args) {
        MyLinkedListQueue queue = new MyLinkedListQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(3);
        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.dequeue().key);

    }
}
