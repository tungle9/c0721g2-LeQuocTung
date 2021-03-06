package _09_DSA.practice;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT = 10;
    private Object elements[];

    public MyList(int size, Object[] elements) {
        this.size = size;
        this.elements = elements;
    }

    public MyList() {
        elements = new Object[DEFAULT];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }

//    @Override
//    public String toString() {
//        return "MyList{" +
//                "size=" + size +
//                ", elements=" + Arrays.toString(elements) +
//                '}';
//    }
}
