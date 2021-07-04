package com.example.model.service.impl.employee_impl;

import com.example.model.entity.employee.Division;
import com.example.model.repository.employee_repository.IDivisionRepository;
import com.example.model.service.interface_service.employee_service.IDivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class DivisionServiceImpl implements IDivisionService {

    @Autowired
    private IDivisionRepository divisionRepository;
    @Override
    public Iterable<Division> findAll() {
        return divisionRepository.findAll();
    }

    @Override
    public Optional<Division> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public void save(Division division) {

    }

    @Override
    public void remove(Integer id) {

    }
}
