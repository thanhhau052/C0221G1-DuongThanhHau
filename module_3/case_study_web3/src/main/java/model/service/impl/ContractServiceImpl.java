package model.service.impl;

import model.bean.contract.AttachService;
import model.bean.contract.Contract;
import model.bean.contract.ContractDetail;
import model.repository.ContractDetailRepository;
import model.repository.ContractRepository;
import model.service.commom.Validate;
import model.service.interfacee.IContractService;

import java.sql.SQLException;
import java.util.List;

public class ContractServiceImpl implements IContractService {
    ContractRepository contractRepository=new ContractRepository();
    ContractDetailRepository contractDetailRepository = new ContractDetailRepository();
    Validate validate =new Validate();
    @Override
    public boolean createContract(Contract contract) throws SQLException {
        try {
            validate.validateDate(contract.getContractEndDate());
            validate.validateDate(contract.getContractStartDate());
            validate.validateINumber(contract.getContractDeposit());
            validate.validateINumber(contract.getContractTotal());

        }catch (Exception e){
            e.printStackTrace();
        }
        return contractRepository.createContract(contract);
    }

    @Override
    public boolean createContractDetail(ContractDetail contractDetail) throws SQLException {
        try {
            validate.validateINumber(contractDetail.getQuantity());
        }catch (Exception e){
            e.printStackTrace();
        }
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

    @Override
    public Contract findById(int id) {
        return  contractRepository.selectContract(id) ;
    }

    @Override
    public boolean update(Contract contract) {
        return contractRepository.update(contract);
    }
}