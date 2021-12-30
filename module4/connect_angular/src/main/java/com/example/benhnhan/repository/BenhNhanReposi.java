package com.example.benhnhan.repository;

import com.example.benhnhan.model.BenhNhan;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BenhNhanReposi extends PagingAndSortingRepository<BenhNhan,Long> {
}
