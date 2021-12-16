package com.example.furama.service;


import com.example.furama.model.customer.CustomerType;
import com.example.furama.model.employee.Position;
import com.example.furama.reponsitory.PositionReposi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PositionService {


    @Autowired
    PositionReposi positionReposi;



    public Iterable<Position> findAll() {
        return positionReposi.findAll();
    }


}
