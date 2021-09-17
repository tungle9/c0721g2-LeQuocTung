package _11_java_collection_framework.excersice;

import java.util.Comparator;

public class SortDown implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return (int) (o2.getPrice() -o1.getPrice());
    }
}
