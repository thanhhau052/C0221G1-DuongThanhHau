package com.example.model.service.impl.servce_impl;

import com.example.model.entity.service.Services;
import com.example.model.repository.service_repository.IServiceRepository;
import com.example.model.service.interface_service.service_service.IServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServiceServiceImpl implements IServiceService {
    @Autowired
    private IServiceRepository serviceRepository;
    @Override
    public Iterable<Services> findAll() {
        return serviceRepository.findAll();
    }

    @Override
    public Optional<Services> findById(Integer id) {
        return serviceRepository.findById(id);
    }

    @Override
    public void save(Services service) {
        serviceRepository.save(service);
    }

    @Override
    public void remove(Integer id) {
    serviceRepository.deleteById(id);
    }

    @Override
    public Page<Services> findByServiceNameContaining(String name, Pageable pageable) {
        return serviceRepository.findByServiceNameContaining(name,pageable);
    }

    @Override
    public Page<Services> findAll(Pageable pageable) {
        return serviceRepository.findAll(pageable);
    }
}
