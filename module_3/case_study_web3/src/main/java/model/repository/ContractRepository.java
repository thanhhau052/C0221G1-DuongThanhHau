package model.repository;

import model.bean.contract.AttachService;
import model.bean.contract.Contract;
import model.bean.contract.ContractDetail;
import model.bean.view_customer.CustomerUserService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContractRepository {
    BaseRepository baseRepository = new BaseRepository();
    String insertContract = "insert into contract (employee_id,customer_id,service_id,contract_start_date,contract_end_date,contract_deposit,contract_total)\n" +
            "values  \n" +
            "(?,?,?,?,?,?,?);";
    final String UPDATE_CONTRACT = "update contract\n" +
            "set employee_id=?, customer_id=?,service_id=?,contract_start_date?,contract_end_date=?,contract_deposit=?,contract_total=?\n" +
            "where contract_id=?";
    final String SELECT_CONTRACT_BY_ID = "select* from contract where contract_id=?";
    final String SEARCH_CUSTOMEUSESERVICE = "select* from view_customer\n" +
            "where customer_name like ?";

    public boolean createContract(Contract contract) throws SQLException {
        boolean check = false;
        Connection connection = baseRepository.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement(insertContract);
            statement.setInt(1, contract.getEmployeeId());
            statement.setInt(2, contract.getCustomerId());
            statement.setInt(3, contract.getServiceId());
            statement.setString(4, contract.getContractStartDate());
            statement.setString(5, contract.getContractEndDate());
            statement.setInt(6, contract.getContractDeposit());
            statement.setInt(6, contract.getContractTotal());
            check = statement.executeUpdate() > 0;
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return check;
    }


    public List<Contract> findByAllContract() {
        Connection connection = baseRepository.getConnection();
        List<Contract> contracts = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement("select * from contract");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int contractId = resultSet.getInt("contract_id");
                int employeeId = resultSet.getInt("employee_id");
                int customerId = resultSet.getInt("customer_id");
                int serviceId = resultSet.getInt("service_id");
                String contractStartDate = resultSet.getString("contract_start_date");
                String contractEndDate = resultSet.getString("contract_end_date");
                int contractDeposit = resultSet.getInt("contract_deposit");
                int contractTotal = resultSet.getInt("contract_total");
                contracts.add(new Contract(contractId, employeeId, customerId, serviceId, contractStartDate, contractEndDate, contractDeposit, contractTotal));
            }
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return contracts;
    }


    public List<AttachService> findByAllAttachService() {
        Connection connection = baseRepository.getConnection();
        List<AttachService> attachServices = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement("select * from attach_service");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int attachServiceId = resultSet.getInt("attach_service_id");
                String attachServiceName = resultSet.getString("attach_service_name");
                double attachServiceCost = resultSet.getDouble("attach_service_cost");
                int attachServiceUnit = resultSet.getInt("attach_service_until");
                String attachServiceStatus = resultSet.getString("attach_service_status");
                attachServices.add(new AttachService(attachServiceId, attachServiceName, attachServiceCost, attachServiceUnit, attachServiceStatus));
            }
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return attachServices;
    }

    public boolean update(Contract conTract) {
        boolean rowUpdated = false;
        Connection connection = baseRepository.getConnection();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(UPDATE_CONTRACT);
            preparedStatement.setInt(1, conTract.getEmployeeId());
            preparedStatement.setInt(2, conTract.getCustomerId());
            preparedStatement.setInt(3, conTract.getServiceId());
            preparedStatement.setString(4, conTract.getContractStartDate());
            preparedStatement.setString(5, conTract.getContractEndDate());
            preparedStatement.setInt(6, conTract.getContractDeposit());
            preparedStatement.setInt(7, conTract.getContractTotal());
            preparedStatement.setInt(8, conTract.getContractId());
            rowUpdated = preparedStatement.executeUpdate() > 0;
            preparedStatement.close();
            connection.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return rowUpdated;

    }

    public Contract selectContract(int id) {
        Connection connection = baseRepository.getConnection();
        PreparedStatement preparedStatement = null;
        Contract contract = null;
        try {
            preparedStatement = connection.prepareStatement(SELECT_CONTRACT_BY_ID);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int employeeId = resultSet.getInt("employee_id");
                int customerId = resultSet.getInt("customer_id");
                int serviceId = resultSet.getInt("service_id");
                String contractStartDate = resultSet.getString("contract_start_date");
                String contractEndDate = resultSet.getString("contract_end_date");
                int deposit = resultSet.getInt("contract_deposit");
                int total = resultSet.getInt("contract_total");
                contract = new Contract(id, employeeId, customerId, serviceId, contractStartDate, contractEndDate, deposit, total);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return contract;
    }

    public List<CustomerUserService> search(String search) {
        Connection connection = baseRepository.getConnection();
        List<CustomerUserService> customerUseServices = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SEARCH_CUSTOMEUSESERVICE);
            preparedStatement.setString(1, "%" + search + "%");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int contractId = resultSet.getInt("contract_id");
                int customerId = resultSet.getInt("customer_id");
                String customerName = resultSet.getString("customer_name");
                String serviceName = resultSet.getString("service_name");
                String contractStartDate = resultSet.getString("contract_start_date");
                String contractEndDate = resultSet.getString("contract_end_date");
                customerUseServices.add(new CustomerUserService(contractId, customerId, customerName, serviceName, contractStartDate, contractEndDate));


            }
            preparedStatement.close();
            connection.close();


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return customerUseServices;
    }
}