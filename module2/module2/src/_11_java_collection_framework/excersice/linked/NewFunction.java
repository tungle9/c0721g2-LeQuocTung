package _11_java_collection_framework.excersice.linked;

import _09_DSA.excercise.LinkedList;
import _11_java_collection_framework.excersice.Product;

public class NewFunction {
    private LinkedList<Product> linkedList;

    public NewFunction(LinkedList<Product> linkedList){
        this.linkedList = linkedList;
    }

    public NewFunction() {
        this.linkedList = new LinkedList<>();
    }

    public void add(Product product) {
        linkedList.addFirst(product);
    }
    public void show() {
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
    }
}

