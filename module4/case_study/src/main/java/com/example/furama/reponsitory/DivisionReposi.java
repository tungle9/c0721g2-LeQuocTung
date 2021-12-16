package com.example.furama.reponsitory;

import com.example.furama.model.employee.Division;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DivisionReposi extends PagingAndSortingRepository<Division,Integer> {
}
