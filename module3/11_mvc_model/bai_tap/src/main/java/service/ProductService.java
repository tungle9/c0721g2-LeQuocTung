package service;

import model.Product;

import java.util.List;

public interface ProductService {

    List<Product> findAll();

    //thêm // cập nhật // xóa // tìm kiếm theo tên

    void save(Product product);

    void update(int id , Product product);

    Product findByName(String name);

    Product findById(int id);

    void remove(String name);

}
