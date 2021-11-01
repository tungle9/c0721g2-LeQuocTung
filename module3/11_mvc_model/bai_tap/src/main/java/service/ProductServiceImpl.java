package service;

import model.Product;

import java.util.*;

public class ProductServiceImpl implements ProductService {
    static Map<Integer,Product> products;

    static {
        products = new LinkedHashMap<>();

        products.put(1,new Product(1,"Banana","VietNam",10.000));
        products.put(2,new Product(2,"Cigar","Cuba",15.000));
        products.put(3,new Product(3,"Thanh long","Khanh Hoa",10.000));
        products.put(4,new Product(4,"Cafe","Buon me thuoc",500.000));
    }


    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getIdProduct(),product);

    }

    @Override
    public void update(int id, Product product) {
        products.put(id,product);
    }

    @Override
    public Product findByName(String name) {
        return products.get(name);
    }

    @Override
    public Product findById(int id) {
        return null;
    }

    @Override
    public void remove(String name) {
        products.remove(name);
    }
}
