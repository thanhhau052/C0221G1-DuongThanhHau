package com.example.model.service.interface_service.contract_service;

import com.example.model.entity.contract.Contract;
import com.example.model.entity.contract.ContractDetail;
import com.example.model.service.interface_service.IGeneralService;

public interface IContractDetailService extends IGeneralService<ContractDetail> {
    Iterable<Contract> findAllContract();
}
