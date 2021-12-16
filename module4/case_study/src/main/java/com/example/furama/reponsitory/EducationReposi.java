package com.example.furama.reponsitory;

import com.example.furama.model.employee.EducationDegree;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface EducationReposi extends PagingAndSortingRepository<EducationDegree,Integer> {
}
