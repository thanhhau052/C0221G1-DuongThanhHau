package com.example.model.repository;

import com.example.model.entity.customer.CustomerType;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerTypeRepository extends PagingAndSortingRepository<CustomerType,Integer> {
}
