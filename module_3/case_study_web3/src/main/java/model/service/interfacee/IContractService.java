package model.service.interfacee;


import model.bean.contract.AttachService;
import model.bean.contract.Contract;
import model.bean.contract.ContractDetail;

import java.sql.SQLException;
import java.util.List;

public interface IContractService {
    boolean createContract(Contract contract) throws SQLException;
    boolean createContractDetail(ContractDetail contractDetail) throws SQLException;
    List<Contract> findByAllContract() ;
    List<AttachService> findByAllAttachService() ;
    Contract findById(int id );
    boolean update(Contract contract);

}