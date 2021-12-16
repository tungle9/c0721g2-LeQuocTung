package com.example.furama.service;


import com.example.furama.model.customer.CustomerType;
import com.example.furama.model.employee.EducationDegree;
import com.example.furama.reponsitory.EducationReposi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducationService {
    @Autowired
    EducationReposi educationReposi;


    public Iterable<EducationDegree> findAll() {
        return educationReposi.findAll();
    }

}
