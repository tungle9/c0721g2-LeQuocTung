package _11_java_collection_framework.excersice;

import java.util.Comparator;

public class SortUp implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return (int) (o1.getPrice() -o2.getPrice());
    }
}
