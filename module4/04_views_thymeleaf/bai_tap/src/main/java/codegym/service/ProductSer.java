package codegym.service;

import codegym.model.Product;

import java.util.*;

public class ProductSer implements IProductSer {

    private static final Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "cafe", 50000, "limit", "USA"));
        products.put(2, new Product(2, "rice", 32132, "abc", "VN"));
        products.put(3, new Product(3, "bede", 50000, "limit", "Thailand"));
        products.put(4, new Product(4, "gucci", 121355, "fashion-car", "Italy"));
        products.put(5, new Product(5, "pranda", 54548971, "fashion", "France"));
    }


    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);

    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);

    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }


    @Override
    public List<Product> findByName(String name) {
        List<Product> list = new ArrayList<>();
        for (Map.Entry<Integer, Product> map : products.entrySet()) {
            if (map.getValue().getName().contains(name)) {
                list.add(map.getValue());
            }
        }
        return list;
    }
}
//        Collection<Product> values = products.values();
//
//        List<Product> productList = new ArrayList<>(values);
//        for (Product product : productList) {
//            if (product.getName().equals(name)) {
//                return product;
//            }
//        }
//        return null;
//    }

