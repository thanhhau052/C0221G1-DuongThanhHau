package com.example.model.service.impl.contract_impl;

import com.example.model.entity.contract.Contract;
import com.example.model.entity.contract.ContractDetail;
import com.example.model.repository.contract_repository.IContractDetailRepository;
import com.example.model.repository.contract_repository.IContractRepository;
import com.example.model.service.interface_service.contract_service.IContractDetailService;
import com.example.model.service.interface_service.contract_service.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ContractDetailServiceImpl implements IContractDetailService {
    @Autowired
    private IContractDetailRepository contractDetailRepository;
    @Autowired
    private IContractRepository contractRepository;

    @Override
    public Iterable<Contract> findAllContract() {
        Iterable<Contract> list = contractRepository.findAll();
        return list;
    }

    @Override
    public Iterable<ContractDetail> findAll() {
        return contractDetailRepository.findAll();
    }

    @Override
    public Optional<ContractDetail> findById(Integer id) {
        return contractDetailRepository.findById(id);
    }

    @Override
    public void save(ContractDetail contractDetail) {
        contractDetailRepository.save(contractDetail);
    }

    @Override
    public void remove(Integer id) {
        contractDetailRepository.deleteById(id);
    }
}
