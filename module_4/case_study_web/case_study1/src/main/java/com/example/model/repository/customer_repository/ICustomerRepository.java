package com.example.model.repository.customer_repository;

import com.example.model.entity.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Integer> {

    @Query(value = "select * from customer where  customer_name like %?1% and flag=0  and customer_birth_day like %?2% and customer_id_card like %?3% ",
            nativeQuery = true)
    Page<Customer> findByCustomerNameContaining(String name, String birthday, String idCard, Pageable pageable);
//    @Query(value = "select * from customer where  customer_name ", nativeQuery = true)
//    Page<Customer> findAll(Pageable pageable);
//@Query(value = "select * from customer where name like %?1% && flag = 0 && birthday like %?2% && id_card like %?3% order by id desc ",nativeQuery = true)
//Page<Customer> findAllCustomer(String name,String birthday,String idCard, Pageable pageable);
}
