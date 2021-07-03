package com.example.model.service;

import com.example.model.entity.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

//@Service
public interface ICustomerService extends IGeneralService<Customer> {
    Page<Customer> findByCustomerNameContaining(String name, Pageable pageable);
    Page<Customer> findAll(Pageable pageable);
}
