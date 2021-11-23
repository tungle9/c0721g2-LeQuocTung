//package com.example.bai_tap.service;
//
//import com.example.bai_tap.model.Form;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@Service
//public class FormService implements IFormService {
//
//    @Autowired
//    private IFormService iFormService;
//
//    @Override
//    public Iterable<Form> findAll() {
//        return iFormService.findAll();
//    }
//
//    @Override
//    public Optional<Form> findById(Integer id) {
//        return iFormService.findById(id);
//    }
//
//    @Override
//    public void save(Form form) {
//        iFormService.save(form);
//
//    }
//
//    @Override
//    public void remove(Integer id) {
//        iFormService.remove(id);
//    }
//}
