package com.example.model.service;


import com.example.model.entity.Customer;

public interface ICustomerService {
    boolean insertWithStoredProcedure(Customer customer);
}