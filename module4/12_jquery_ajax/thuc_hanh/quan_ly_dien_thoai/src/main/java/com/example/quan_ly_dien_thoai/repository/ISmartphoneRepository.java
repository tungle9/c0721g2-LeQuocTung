package com.example.quan_ly_dien_thoai.repository;

import com.example.quan_ly_dien_thoai.model.Smartphone;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISmartphoneRepository extends PagingAndSortingRepository<Smartphone,Long> {

}
