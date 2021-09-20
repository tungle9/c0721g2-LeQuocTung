package _11_java_collection_framework.excersice.linked;

import _11_java_collection_framework.excersice.Product;

public class TestLinked {
    public static void main(String[] args) {
        Product product = new Product("coca",100,2300);
        Product product1 = new Product("pepsi",123,2400);
        Product product2 = new Product("fanta",124,2500);
        NewFunction newFunction = new NewFunction();
        newFunction.add(product);
        newFunction.add(product1);
        newFunction.add(product2);
        newFunction.show();
    }
}
