package com.example.model.service.impl.employee_impl;

import com.example.model.entity.employee.Position;
import com.example.model.repository.employee_repository.IPositionRepository;
import com.example.model.service.interface_service.employee_service.IPositionService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class PositionServiceImpl implements IPositionService {
    @Autowired
    private IPositionRepository positionRepository;
    @Override
    public Iterable<Position> findAll() {
        return positionRepository.findAll();
    }

    @Override
    public Optional<Position> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public void save(Position position) {

    }

    @Override
    public void remove(Integer id) {

    }
}
