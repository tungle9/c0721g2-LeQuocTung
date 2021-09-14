package _09_DSA.excercise;

import java.util.Arrays;

public class MyList<E> {
    int size = 0;
    static final int DEFAULT = 10;
    private Object[] elements;
    public MyList() {
        elements = new Object[DEFAULT];
    }
    public void ensureCapacity(int capacity) { // tăng sức chứa
        if (capacity >= 0) {
            int newSize = this.elements.length + capacity;
            elements = Arrays.copyOf(elements, newSize);
            System.out.println("tổng kích thước khi tăng là " + elements.length);
        } else {
            throw new IndexOutOfBoundsException("capacity:" + capacity);
        }
    }

    public void add(E e) {
        if (size == elements.length) { // nếu bằng thì tăng lên 1
            ensureCapacity(1);
        }
        elements[size] = e;
        size++;
    }

    public void add(E e, int index) {
        if (index > elements.length) {
            System.out.println(index + "kích thước vượt quá list");
        }
    }
    public int size() {
        return size;
    }
    public int lenght(){
        return elements.length;
    }

    public E get(int index) {
        return (E) elements[index];
    }

    public E remove(int index) {
        if (index >= elements.length || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        E element = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return element;
    }

    public void clear() {
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    public E clone() {
        MyList<E> a = new MyList<>();
        a.elements = Arrays.copyOf(elements, size);
        return (E) a;
    }
}