package com.example.model.service.impl.servce_impl;

import com.example.model.entity.service.RentType;
import com.example.model.repository.service_repository.IRentTypeRepository;
import com.example.model.service.interface_service.service_service.IRentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class RentTypeServiceImpl implements IRentTypeService {
    @Autowired
    private IRentTypeRepository rentTypeRepository;
    @Override
    public Iterable<RentType> findAll() {
        return rentTypeRepository.findAll();
    }

    @Override
    public Optional<RentType> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public void save(RentType rentType) {

    }

    @Override
    public void remove(Integer id) {

    }
}
