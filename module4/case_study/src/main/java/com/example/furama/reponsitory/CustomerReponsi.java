package com.example.furama.reponsitory;

import com.example.furama.dto.Dto;
import com.example.furama.model.customer.Customer;
import com.example.furama.model.employee.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerReponsi extends PagingAndSortingRepository<Customer, Integer> {

    List<Customer> findByNameContaining(String name);


    Page<Customer> findAllByNameContaining(Optional<String> name, Pageable pageable);


    @Query
            (value = " select c.id, c.name, c.id_card, att.attach_names, att.attach_cost, att.attach_status, cd.quantity\n" +
                    "from customer c\n" +
                    "join contract ct on ct.customer_id = c.id\n" +
                    "join contract_detail cd on cd.contract_id = ct.contract_id\n" +
                    "join attach_service att on att.attach_id = cd.attach_service_id", nativeQuery = true)
    Page<Dto> CustomerContract(Pageable pageable);
}
