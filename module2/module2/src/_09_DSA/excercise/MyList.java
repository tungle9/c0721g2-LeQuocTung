package _09_DSA.excercise;

import java.util.Arrays;

public class MyList<E> {
    int size = 0 ;
    static final int DEFAULT = 10;
     Object elements[];
     public MyList(){
         elements = new Object[DEFAULT];
     }
     public void ensureCapacity(int capacity){
       elements = Arrays.copyOf(elements,capacity);
     }
     public E remove(int index) {
         if(index >= size || index < 0 ){
            elements[index] = elements[size--];
         }
         return (E) elements[index];
     }

}
