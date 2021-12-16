package com.example.furama.service;


import com.example.furama.model.employee.Employee;
import com.example.furama.reponsitory.EmployeeReposi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements IEmployeeService {
    @Autowired
    EmployeeReposi employeeReposi;


    public Page<Employee> findAllByNameContaining(Optional<String> name, Pageable pageable) {
        return employeeReposi.findAllByNameContaining(name, pageable);

    }


    public Page<Employee> findAllPage(Pageable pageable) {
        return employeeReposi.findAll(pageable);
    }


    @Override
    public Iterable<Employee> findAll() {
        return employeeReposi.findAll();
    }

    @Override
    public Optional<Employee> findById(Integer id) {
        return employeeReposi.findById(id);
    }

    @Override
    public Object save(Employee employee) {
        return employeeReposi.save(employee);
    }

    @Override
    public void remove(Integer id) {
        employeeReposi.deleteById(id);
    }

    @Override
    public List<Employee> searchByName(String name) {
        return null;
    }
}
