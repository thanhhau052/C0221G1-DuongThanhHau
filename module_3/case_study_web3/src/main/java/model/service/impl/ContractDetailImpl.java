package model.service.impl;

import model.bean.contract.Contract;
import model.bean.contract.ContractDetail;
import model.repository.ContractDetailRepository;
import model.service.IContractService;

import java.util.List;

public class ContractDetailImpl implements IContractService {
    ContractDetailRepository contractDetailRepository = new ContractDetailRepository();

    public boolean insert(ContractDetail contractDetail) {
        return contractDetailRepository.insert(contractDetail);
    }


    public List<ContractDetail> findAll() {
        return contractDetailRepository.findAll();
    }

    @Override
    public void insertContract(Contract contract) {

    }
}
