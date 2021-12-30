package com.example.benhnhan.controller;

import com.example.benhnhan.model.BenhNhan;
import com.example.benhnhan.service.BenhNhanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/benh-nhan")
public class BenhNhanController {
    @Autowired
    BenhNhanService benhNhanService;

//    @GetMapping("/")
//    public String showList(Model model) {
//       Iterable<BenhNhan> benhNhan = benhNhanService.findAll();
//        model.addAttribute("benhNhan",benhNhan);
//        return ("benh-nhan/list");
//    }

    @GetMapping
    public ResponseEntity<Iterable<BenhNhan>> ShowListBenhNhan() {
        List<BenhNhan> benhNhans = (List<BenhNhan>) benhNhanService.findAll();
        if (benhNhans.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(benhNhans, HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<BenhNhan> findCustomerById(@PathVariable Long id) {
        Optional<BenhNhan> benhNhans = benhNhanService.findById(id);
        if (!benhNhans.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(benhNhans.get(), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<BenhNhan> updateCustomer(@PathVariable Long id, @RequestBody BenhNhan benhNhan) {
        Optional<BenhNhan> benhNhans = benhNhanService.findById(id);
        if (!benhNhans.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        benhNhan.setId(benhNhans.get().getId());
        return new ResponseEntity<>(benhNhanService.save(benhNhan), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<BenhNhan> deleteCustomer(@PathVariable Long id) {
        Optional<BenhNhan> benhNhans = benhNhanService.findById(id);
        if (!benhNhans.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        benhNhanService.remove(id);
        return new ResponseEntity<>(benhNhans.get(), HttpStatus.NO_CONTENT);
    }

    @PostMapping
    public ResponseEntity<BenhNhan> saveBenhAn(@RequestBody BenhNhan benhNhan) {
        return new ResponseEntity<>(benhNhanService.save(benhNhan), HttpStatus.CREATED);
    }
}
