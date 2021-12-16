package com.example.furama.reponsitory;

import com.example.furama.model.employee.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeReposi extends PagingAndSortingRepository<Employee,Integer> {

    Page<Employee> findAllByNameContaining(Optional<String> name, Pageable pageable);

}
