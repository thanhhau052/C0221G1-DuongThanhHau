package com.example.model.service.impl.contract_impl;

import com.example.model.entity.contract.Contract;
import com.example.model.repository.contract_repository.IContractRepository;
import com.example.model.service.interface_service.contract_service.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;
@Service
public class ContractServiceImpl implements IContractService {
    @Autowired
    private IContractRepository contractRepository;
    @Override
    public Iterable<Contract> findAll() {
        Page<Contract> contractPage= (Page<Contract>) contractRepository.findAll();
        for(Contract c : contractPage){
            try {
                Date startDate = new SimpleDateFormat("yyyy-MM-dd").parse(c.getContractStartDay());
                Date endDate = new SimpleDateFormat("yyyy-MM-dd").parse(c.getContractEndDay());
                Double totalMoney = endDate.compareTo(startDate)*c.getService().getServiceCost();
                c.setContractTotal(totalMoney);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return contractPage;
    }

    @Override
    public Optional<Contract> findById(Integer id) {
        return contractRepository.findById(id);
    }

    @Override
    public void save(Contract contract) {
        contractRepository.save(contract);
    }

    @Override
    public void remove(Integer id) {
        contractRepository.deleteById(id);
    }

    @Override
    public Page<Contract> findAllCustomerName(String name, Pageable pageable) {
        return contractRepository.findAllCustomerName(name,pageable);
    }
}
