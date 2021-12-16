package com.example.furama.service;

import com.example.furama.dto.Dto;
import com.example.furama.model.customer.Customer;
import com.example.furama.model.employee.Employee;
import com.example.furama.reponsitory.CustomerReponsi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private CustomerReponsi customerReponsi;


    public Page<Customer> findAllByNameContaining(Optional<String> name, Pageable pageable) {
        return customerReponsi.findAllByNameContaining(name, pageable);

    }


    public Page<Customer> findAllPage(Pageable pageable) {
        return customerReponsi.findAll(pageable);
    }


    @Override
    public Iterable<Customer> findAll() {
        return customerReponsi.findAll();
    }

    @Override
    public Optional<Customer> findById(Integer id) {
        return customerReponsi.findById(id);
    }


    @Override
    public Customer save(Customer customer) {
        return customerReponsi.save(customer);
    }

    @Override
    public void remove(Integer id) {
        customerReponsi.deleteById(id);
    }


    @Override
    public List<Customer> searchByName(String name) {
        return customerReponsi.findByNameContaining(name);
    }


    @Override
    public Page<Dto> CustomerContract(Pageable pageable) {
        return customerReponsi.CustomerContract(pageable);
    }


//    @Override
//    public List<Customer> searchByName(String name) {
//       List<Customer> customers;
//        customers = (ArrayList<Customer>) customerReponsi;
//        for (Customer customer : customers) {
//            if (customer.getName().contains(name)) {
//            }
//            return customers;
//        }
//        return null;
//    }
}
