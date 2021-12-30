package com.example.benhnhan.service;


import com.example.benhnhan.model.BenhNhan;
import com.example.benhnhan.repository.BenhNhanReposi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BenhNhanService implements IBenhNhanService{
    @Autowired
    BenhNhanReposi benhNhanReposi;


    @Override
    public Iterable<BenhNhan> findAll() {
        return benhNhanReposi.findAll();
    }

    @Override
    public Optional<BenhNhan> findById(Long id) {
        return benhNhanReposi.findById(id);
    }

    @Override
    public BenhNhan save(BenhNhan benhNhan) {
        return benhNhanReposi.save(benhNhan);
    }

    @Override
    public void remove(Long id) {
        benhNhanReposi.deleteById(id);
    }

    @Override
    public List<BenhNhan> searchByName(String name) {
        return null;
    }
}
