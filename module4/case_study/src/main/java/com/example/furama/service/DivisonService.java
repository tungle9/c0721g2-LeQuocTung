package com.example.furama.service;


import com.example.furama.model.employee.Division;
import com.example.furama.reponsitory.DivisionReposi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DivisonService {
    @Autowired
    DivisionReposi divisionReposi;


    public Iterable<Division> findAll() {
        return divisionReposi.findAll();
    }

}
