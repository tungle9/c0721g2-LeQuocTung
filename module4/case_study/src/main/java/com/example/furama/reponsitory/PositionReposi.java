package com.example.furama.reponsitory;

import com.example.furama.model.employee.Position;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface PositionReposi extends PagingAndSortingRepository<Position,Integer> {
}
