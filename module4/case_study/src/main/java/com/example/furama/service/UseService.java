package com.example.furama.service;


import com.example.furama.model.service.Services;
import com.example.furama.reponsitory.ServiceReposi;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class UseService implements IService {
    @Autowired
    ServiceReposi serviceReposi;


    @Override
    public Iterable<Services> findAll() {
       return serviceReposi.findAll();
    }

    @Override
    public Optional<Services> findById(Integer id) {
        return serviceReposi.findById(id);
    }

    @Override
    public Object save(Services service) {
     return serviceReposi.save(service);
    }

    @Override
    public void remove(Integer id) {
        serviceReposi.deleteById(id);

    }

    @Override
    public List<Services> searchByName(String name) {
        return null;
    }
}
