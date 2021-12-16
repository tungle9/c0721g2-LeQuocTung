package com.example.furama.dto;

import com.example.furama.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;

public interface Dto {

    public Integer getId();

    public String getName();

    public String getId_card();

    public String getAttach_names();

    public double getAttach_cost();

    public int getAttach_status();

    public int getQuantity();

}





//    @Query
//            (value = " select c.id, c.name, c.id_card, att.attach_name, att.attach_cost, att.attach_status, cd.quantity\n" +
//                    "from customer c\n" +
//                    "join contract ct on ct.customer_id = c.id\n" +
//                    "join contract_detail cd on cd.contract_id = ct.contract_id\n" +
//                    "join attach_service att on att.attach_id = cd.attach_service_id", nativeQuery = true)
//    Page<Customer> CustomerContract(Pageable pageable);