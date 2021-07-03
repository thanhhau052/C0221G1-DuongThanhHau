package com.example.model.service.impl;

import com.example.model.entity.customer.CustomerType;
import com.example.model.repository.ICustomerTypeRepository;
import com.example.model.service.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class CustomerTypeServiceImpl implements ICustomerTypeService {
    @Autowired
    private ICustomerTypeRepository customerTypeRepository;
    @Override

    public Iterable<CustomerType> findAll() {
        return customerTypeRepository.findAll();
    }

    @Override
    public Optional<CustomerType> findById(Integer id) {
        return  customerTypeRepository.findById(id);
    }

    @Override
    public void save(CustomerType customerType) {
        customerTypeRepository.save(customerType);
    }

    @Override
    public void remove(Integer id) {
        customerTypeRepository.deleteById(id);
    }
}
