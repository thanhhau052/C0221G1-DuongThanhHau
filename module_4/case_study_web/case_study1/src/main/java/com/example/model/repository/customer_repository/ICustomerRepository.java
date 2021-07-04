package com.example.model.repository.customer_repository;

import com.example.model.entity.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer,Integer> {
    Page<Customer> findByCustomerNameContaining(String name, Pageable pageable);
    Page<Customer> findAll(Pageable pageable);
}
