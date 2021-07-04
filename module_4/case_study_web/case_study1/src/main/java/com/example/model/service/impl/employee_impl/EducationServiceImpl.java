package com.example.model.service.impl.employee_impl;

import com.example.model.entity.employee.EducationDegree;
import com.example.model.repository.employee_repository.IEducationRepository;
import com.example.model.service.interface_service.employee_service.IEducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class EducationServiceImpl implements IEducationService {
    @Autowired
    private IEducationRepository educationRepository;
    @Override
    public Iterable<EducationDegree> findAll() {
        return educationRepository.findAll();
    }

    @Override
    public Optional<EducationDegree> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public void save(EducationDegree educationDegree) {

    }

    @Override
    public void remove(Integer id) {

    }
}
