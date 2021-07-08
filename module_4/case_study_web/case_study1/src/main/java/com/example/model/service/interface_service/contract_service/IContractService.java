package com.example.model.service.interface_service.contract_service;

import com.example.model.entity.contract.Contract;
import com.example.model.service.interface_service.IGeneralService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IContractService extends IGeneralService<Contract> {
    Page<Contract> findAllCustomerName(String name, Pageable pageable);
}
