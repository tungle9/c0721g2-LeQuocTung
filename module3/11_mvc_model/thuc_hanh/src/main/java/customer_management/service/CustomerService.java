package customer_management.service;

import customer_management.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> finAll();

    void save(Customer customer);

    Customer findById(int id);

    void update(int id , Customer customer);

    void remove (int id);
}
