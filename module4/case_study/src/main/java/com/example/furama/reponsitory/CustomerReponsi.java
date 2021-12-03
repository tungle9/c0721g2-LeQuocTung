package com.example.furama.reponsitory;

import com.example.furama.model.customer.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerReponsi extends PagingAndSortingRepository<Customer, Integer> {

    List<Customer> findByNameContaining(String name);



}
