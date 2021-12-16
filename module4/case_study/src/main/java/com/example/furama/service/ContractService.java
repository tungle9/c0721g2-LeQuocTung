package com.example.furama.service;

import com.example.furama.model.Contract.Contract;
import com.example.furama.reponsitory.ContractReposi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;



@Service
public class ContractService  implements IContractService{
    @Autowired
    ContractReposi contractReposi;


    @Override
    public Iterable<Contract> findAll() {
        return null;
    }

    @Override
    public Optional<Contract> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public Object save(Contract contract) {
        return null;
    }

    @Override
    public void remove(Integer id) {

    }

    @Override
    public List<Contract> searchByName(String name) {
        return null;
    }

}
