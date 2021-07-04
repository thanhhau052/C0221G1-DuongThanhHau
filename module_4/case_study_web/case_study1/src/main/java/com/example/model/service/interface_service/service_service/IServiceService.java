package com.example.model.service.interface_service.service_service;

import com.example.model.entity.service.Services;
import com.example.model.service.interface_service.IGeneralService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IServiceService extends IGeneralService<Services> {
    Page<Services> findByServiceNameContaining(String name, Pageable pageable);
    Page<Services> findAll(Pageable pageable);
}
