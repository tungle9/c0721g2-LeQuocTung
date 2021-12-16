package com.example.furama.reponsitory;

import com.example.furama.model.Contract.Contract;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractReposi extends PagingAndSortingRepository<Contract,Integer> {
}
