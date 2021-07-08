package com.example.model.repository.contract_repository;

import com.example.model.entity.contract.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IContractRepository extends JpaRepository<Contract,Integer> {
    @Query(value = "select * from contract left join customer " +
                    " on customer.id=contract.customer_id" +
                    " where customer.customer_name like %?% and contract.contract_end_day>= now() " ,nativeQuery = true)
    Page<Contract> findAllCustomerName(String name, Pageable pageable);
}
