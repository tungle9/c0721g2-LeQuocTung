package _09_DSA.excercise;

public class LinkedList<E> {
    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    private Node head;
    private int numNodes = 0;
    public LinkedList() {
    }
    public int size() {
        return numNodes;
    }

    public Object get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;    // gọi tham chiều của vị trí tiếp theo
        }
        return temp.data;
    }

    public int indexOf(E element) {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if ((E) temp.getData() == element)
            return i;
            temp = temp.next;
        }
        return -1;
    }
    public void addLast(E e ){
        Node temp = head;
        for(int i = 0 ; i < numNodes ; i ++){
            temp = temp.next;
        }
        temp.next = new Node(e);
        numNodes++ ;
    }
    public void addFirst(E e ){
        Node temp =  head ;
        head = new Node(e);
        head.next = temp ;
        numNodes++;
    }
}
