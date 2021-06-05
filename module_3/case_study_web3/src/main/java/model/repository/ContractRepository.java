package model.repository;

import model.bean.contract.Contract;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//public class ContractRepository {
//    private  BaseRepository baseRepository = new BaseRepository();
//    private  final  String  INSERT_CONTRACT ="insert into contract (employee_id,customer_id,service_id,contract_start_date," +
//            "contract_end_date,contract_deposit,contract_total)\n" +
//            "values (?,?,?,?,?,?,?)";
////    private  final  String SELECT_
//
//    public  boolean insert(Contract contract){
//        boolean rowInsert=false;
//        Connection connection = baseRepository.getConnection();
//        try {
//            PreparedStatement statement = connection.prepareStatement(INSERT_CONTRACT);
//            statement.setInt(1,contract.getEmployeeId());
//            statement.setInt(2,contract.getCustomerId());
//            statement.setInt(3,contract.getServiceId());
//            statement.setString(4,contract.getContractStartDay());
//            statement.setString(5,contract.getContractEndDay());
//            statement.setDouble(6,contract.getContractDeposit());
//            statement.setDouble(7,contract.getContractTotalMoney());
//            rowInsert= statement.executeUpdate() >0;
//            statement.close();
//            connection.close();
//
//        }catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return  rowInsert;
//    }
//}
public class ContractRepository {
    BaseRepository baseRepository = new BaseRepository();

    BaseRepository repository = new BaseRepository();
    private final String INSERT_CONTRACT = "insert into contract (contract_start_date,contract_end_date,contract_deposit,employee_id,customer_id,service_id," +
            "values (?,?,?,?,?,?,?)";


    public void insertContract(Contract contract) {
        Connection connection = baseRepository.getConnection();
        PreparedStatement statement = null;

        try {
            statement = connection.prepareStatement(INSERT_CONTRACT);
            statement.setString(1, contract.getContractStartDate());
            statement.setString(2, contract.getContractEndDate());
            statement.setDouble(3, contract.getDeposit());
            statement.setDouble(4, contract.getTotalMoney());
            statement.setInt(5, contract.getEmployeeId().getEmployeeId());
            statement.setInt(6, contract.getCustomersId().getCustomerId());
            statement.setInt(7, contract.getServiceId().getServiceId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }
}
