package com.example.quan_ly_dien_thoai.service;

import com.example.quan_ly_dien_thoai.model.Smartphone;
import org.springframework.stereotype.Service;

import java.util.Optional;


public interface ISmartphoneService {
    Iterable<Smartphone> findAll();

    Optional<Smartphone> findById(Long id);

    Smartphone save(Smartphone smartPhone);

    void remove(Long id);
}
