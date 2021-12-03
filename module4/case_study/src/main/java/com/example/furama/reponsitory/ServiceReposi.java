package com.example.furama.reponsitory;

import com.example.furama.model.service.Services;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceReposi extends PagingAndSortingRepository<Services,Integer> {
}
