package com.example.model.repository.service_repository;

import com.example.model.entity.service.Services;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IServiceRepository  extends JpaRepository<Services,Integer> {
    Page<Services> findByServiceNameContaining(String name, Pageable pageable);
    Page<Services> findAll(Pageable pageable);
}
