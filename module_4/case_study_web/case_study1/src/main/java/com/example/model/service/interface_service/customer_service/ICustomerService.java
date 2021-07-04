package com.example.model.service.interface_service.customer_service;

import com.example.model.entity.customer.Customer;
import com.example.model.service.interface_service.IGeneralService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public interface ICustomerService extends IGeneralService<Customer> {
    Page<Customer> findByCustomerNameContaining(String name, Pageable pageable);
    Page<Customer> findAll(Pageable pageable);
}


//co bug o day