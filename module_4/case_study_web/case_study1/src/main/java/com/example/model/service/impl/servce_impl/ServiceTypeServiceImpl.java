package com.example.model.service.impl.servce_impl;

import com.example.model.entity.service.ServiceType;
import com.example.model.repository.service_repository.IServiceTypeRepository;
import com.example.model.service.interface_service.service_service.IServiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class ServiceTypeServiceImpl implements IServiceTypeService {
    @Autowired
    private IServiceTypeRepository serviceTypeRepository;

    @Override
    public Iterable<ServiceType> findAll() {
        return serviceTypeRepository.findAll();
    }

    @Override
    public Optional<ServiceType> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public void save(ServiceType serviceType) {

    }

    @Override
    public void remove(Integer id) {

    }
}
