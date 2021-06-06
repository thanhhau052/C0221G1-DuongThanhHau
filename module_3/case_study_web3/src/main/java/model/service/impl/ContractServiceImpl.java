package model.service.impl;

import model.bean.contract.AttachService;
import model.bean.contract.Contract;
import model.bean.contract.ContractDetail;
import model.repository.ContractDetailRepository;
import model.repository.ContractRepository;
import model.service.IContractService;

import java.sql.SQLException;
import java.util.List;

public class ContractServiceImpl implements IContractService {
    ContractRepository contractRepository=new ContractRepository();
    ContractDetailRepository contractDetailRepository = new ContractDetailRepository();
    @Override
    public boolean createContract(Contract contract) throws SQLException {
        return contractRepository.createContract(contract);
    }

    @Override
    public boolean createContractDetail(ContractDetail contractDetail) throws SQLException {
        return contractDetailRepository.createContractDetail(contractDetail);
    }

    @Override
    public List<Contract> findByAllContract() {
        return contractRepository.findByAllContract();
    }

    @Override
    public List<AttachService> findByAllAttachService() {
        return contractRepository.findByAllAttachService();
    }
}